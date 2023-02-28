package com.cleo.codebase.coroutine.flow

import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.channels.onFailure
import kotlinx.coroutines.channels.trySendBlocking
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*

/**
 * author:CliffLeopard
 * date:2023/2/23
 * time:15:44
 * email:precipiceleopard@gmail.com
 * link:
 */
object FlowCases {
    fun <T> countdown(
        duration: Long,
        interval: Long,
        onCountdown: (Long) -> T
    ): Flow<T> =
        flow { (duration - interval downTo 0 step interval).forEach { emit(it) } }
            .onEach { delay(interval) }
            .flowOn(Dispatchers.Default)
            .onStart { emit(duration) }
            .map {
                onCountdown(it)
            }.flowOn(Dispatchers.Main)


    fun EditText.textChangeFlow(): Flow<CharSequence> = callbackFlow {
        // 构建输入框监听器
        val watcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            // 在文本变化后向流发射数据
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                s?.let {
                    trySend(it).isSuccess
                }
            }
        }
        addTextChangedListener(watcher) // 设置输入框监听器
        awaitClose { removeTextChangedListener(watcher) } // 阻塞以保证流一直运行
    }

    fun View.clickFlow() = callbackFlow {
        setOnClickListener {
            trySendBlocking(it).onFailure {

            }
        }
        awaitClose { setOnClickListener(null) }
    }
}


fun <T, R> Flow<T>.filterMap(
    predicate: (T) -> Boolean,
    transform: suspend (T) -> R
): Flow<R> =
    transform { value -> if (predicate(value)) emit(transform(value)) }


fun <T> Flow<T>.throttleFirst(thresholdMillis: Long): Flow<T> = flow {
    var lastTime = 0L
    collect { upstream ->
        val currentTime = System.currentTimeMillis()
        // 时间差超过阈值则发送数据并记录时间
        if (currentTime - lastTime > thresholdMillis) {
            lastTime = currentTime
            emit(upstream)
        }
    }
}