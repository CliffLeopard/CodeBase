package com.cleo.codebase.coroutine.channel

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.selects.*

/**
 * author:CliffLeopard
 * date:2023/3/3
 * time:17:17
 * email:precipiceleopard@gmail.com
 * link:
 */
@OptIn(ExperimentalCoroutinesApi::class)
object Select {

    @JvmStatic
    fun main(args: Array<String>) {
        runBlocking {
            //sampleStart
            val fizz = fizz()
            val buzz = buzz()
            repeat(7) {
                selectFizzBuzz(fizz, buzz)
            }
            coroutineContext.cancelChildren() // 取消 fizz 和 buzz 协程
            //sampleEnd
        }
    }

    private fun CoroutineScope.fizz() = produce {
        while (true) { // 每 300 毫秒发送一个 "Fizz"
            delay(300)
            send("Fizz")
        }
    }

    private fun CoroutineScope.buzz() = produce<String> {
        while (true) { // 每 500 毫秒发送一个 "Buzz!"
            delay(500)
            send("Buzz!")
        }
    }

    private suspend fun selectFizzBuzz(fizz: ReceiveChannel<String>, buzz: ReceiveChannel<String>) {
        select<Unit> { // <Unit> 意味着该 select 表达式不返回任何结果
            fizz.onReceive { value ->
                // 这是第一个 select 子句
                println("fizz -> '$value'")
            }
            buzz.onReceive { value ->
                // 这是第二个 select 子句
                println("buzz -> '$value'")
            }
        }
    }
}