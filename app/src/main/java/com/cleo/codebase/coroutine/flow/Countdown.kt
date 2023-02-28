package com.cleo.codebase.coroutine.flow

import android.os.Handler
import android.os.Looper
import android.util.Log
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit

/**
 * author:CliffLeopard
 * date:2023/2/23
 * time:15:48
 * email:precipiceleopard@gmail.com
 * link:
 */
// 倒计时器
class Countdown<T>(
    private var duration: Long,         // 倒计时长
    private var interval: Long,         // 倒计时间隔
    private val action: (Long) -> T     // 倒计时后台任务
) {

    companion object {
        fun showCase() {
            Countdown<Long>(60_000L, 2_000L) { time ->
                time
            }.apply {
                onStart = { Log.v("test", "countdown start") }
                onEnd = { ret -> Log.v("test", "countdown end, ret=$ret") }
                accumulator = { acc, value -> acc + value }
            }.start()
        }
    }

    // 任务结果累加值
    var acc: Any? = null

    // 倒计时剩余时间
    private var remainTime = duration

    // 任务开始回调
    private var onStart: (() -> Unit)? = null

    // 任务结束回调
    var onEnd: ((T?) -> Unit)? = null

    // 任务结果累加器
    var accumulator: ((T, T) -> T)? = null

    // 倒计时任务包装类
    private val countdownRunnable by lazy { CountDownRunnable() }

    // 用于主线程回调的 Handler
    private val handler by lazy { Handler(Looper.getMainLooper()) }

    // 线程池
    private val executor by lazy { Executors.newSingleThreadScheduledExecutor() }

    // 启动倒计时
    fun start(delay: Long = 0) {
        if (executor.isShutdown) return
        // 向主线程回调倒计时开始
        onStart?.let { handler.post(it) }
        executor.scheduleAtFixedRate(countdownRunnable, delay, interval, TimeUnit.MILLISECONDS)
    }

    // 将倒计时任务包装成 Runnable
    private inner class CountDownRunnable : Runnable {
        override fun run() {
            remainTime -= interval
            // 执行后台任务并获取返回值
            val value = action(remainTime)
            // 累加任务返回值
            acc = if (acc == null) value else accumulator?.invoke(acc as T, value)
            if (remainTime <= 0) {
                // 关闭倒计时
                executor?.shutdown()
                // 向主线程回调倒计时结束
                handler.post { onEnd?.invoke(acc as? T) }
            }
        }
    }
}