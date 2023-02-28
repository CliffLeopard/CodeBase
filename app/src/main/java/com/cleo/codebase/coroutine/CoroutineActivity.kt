package com.cleo.codebase.coroutine

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cleo.codebase.databinding.ActivityCoroutineBinding
import kotlinx.coroutines.*

class CoroutineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCoroutineBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoroutineBinding.inflate(layoutInflater)
        setContentView(binding.root)
        test()
    }

    suspend fun testSuspend() {

    }

    private fun test() {
        GlobalScope.launch(Dispatchers.IO) {

            // 创建一个独立的协程作用域，
            // 直到所有启动的协程都完成后才结束自身。
            // 它是一个挂起函数，需要运行在协程内或挂起函数内。
            // 当这个作用域中的任何一个子协程失败时，这个作用域失败，所有其他的子程序都被取消。
            // 为并行分解工作而设计的。
            coroutineScope {

            }

            // 与coroutineScope类似，
            // 不同的是子协程的异常不会影响父协程，也不会影响其他子协程。
            //（作用域本身的失败(在block或取消中抛出异常)会导致作用域及其所有子协程失败，但不会取消父协程。）
            supervisorScope {

            }

            //-- async wait 模型
            async {

            }

            // 创建一个新的协程，不会阻塞当前线程，必须在协程作用域中才可以调用
            launch {

            }

            withContext(Dispatchers.IO) {

            }

        }

        // 为UI组件创建主作用域。一个顶层函数，
        // 上下文是SupervisorJob() + Dispatchers.Main，
        // 说明它是一个在主线程执行的协程作用域，通过cancel对协程进行取消。推荐使用。
        MainScope().launch {

        }

        // 阻塞当前线程，用于测试
        runBlocking {

        }


        // 启动一个新的协程而不阻塞当前线程，并返回对协程的引用作为一个Job
        // 协程上下文控制协程生命周期和线程调度，使得协程和该组件生命周期绑定，组件销毁时，协程一并销毁，
        val job = CoroutineScope(Dispatchers.IO).launch {
            delay(1000)//1秒无阻塞延迟（默认单位为毫秒）
            print("CoroutineScope.launch")
        }
        job.cancel()
    }
}