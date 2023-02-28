package com.cleo.codebase.coroutine.flow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.cleo.codebase.databinding.ActivityFlowBinding
import com.cleo.codebase.coroutine.flow.FlowCases.clickFlow
import com.cleo.codebase.coroutine.flow.FlowCases.textChangeFlow
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class FlowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFlowBinding
    private val duration = 100000L
    private val interval = 3000L

    @OptIn(FlowPreview::class, ExperimentalCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFlowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.countDownBtn.setOnClickListener {
            lifecycleScope.launch {
                FlowCases.countdown(duration, interval) {
                    Log.e("GGL", "onCountdown: ${Thread.currentThread().name} $it")
                    binding.timeNow.text = "$it"
                }.collect()
            }

        }

        // debounce防抖，在一定时间范围内产生新的事件，则抛弃现在的事件。选择新的事件来替换。
        binding.editText.textChangeFlow()
            .filter { it.isNotEmpty() }
            .debounce(500) // 300ms防抖
            .flatMapLatest {
                searchFlow(it.toString())
            }
            .flowOn(Dispatchers.IO)   // 让搜索在异步线程中执行
            .onEach { updateUi(it) } // 获取搜索结果并更新界面
            .launchIn(MainScope()) // 在主线程收集搜索结果

        lifecycleScope.launch {
            binding.debounceBtn.clickFlow()
                .throttleFirst(1000L)
                .onEach { Log.e("GGL", "Click Me") }
                .collect()
        }
    }

    // 更新界面
    private fun updateUi(it: List<String>) {
        binding.timeNow.text = it.joinToString("-")
    }

    // 访问网络进行搜索
    private suspend fun search(key: String): List<String> {
        delay(100)
        return listOf(
            "A", "B", "C", key
        )
    }

    // 将搜索关键词转换成搜索结果流
    private fun searchFlow(key: String) = flow {
        emit(search(key))
    }
}