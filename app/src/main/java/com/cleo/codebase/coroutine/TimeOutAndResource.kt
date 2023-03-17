package com.cleo.codebase.coroutine

import android.util.Log
import kotlinx.coroutines.*
import kotlin.coroutines.cancellation.CancellationException

/**
 * author:CliffLeopard
 * date:2023/3/2
 * time:17:53
 * email:precipiceleopard@gmail.com
 * link:
 */

var acquired = 0

class Resource {
    init {
        acquired++
    } // Acquire the resource

    fun close() {
        acquired--
    } // Release the resource
}

object TimeOutAndResource {
    @JvmStatic
    fun main(args: Array<String>) {
        runBlocking {
            var son: Deferred<Boolean>? = null
            val father = launch {
                son = async {
                    delay(5000)
                    true
                }
                coroutineContext.cancelChildren()
            }
            delay(300)
            val uncle = launch {
                son?.let {
                    println("开始等待")
                    val result = it.await()
                    println("等待结果: $result")
                }
            }
//            father.cancelAndJoin()
            println("father:cancel")
        }
    }
}
