package com.cleo.codebase.pool

import androidx.core.util.Pools
import java.util.concurrent.atomic.AtomicInteger

/**
 * author:gaoguanling
 * date:2021/12/9
 * time:19:23
 * email:gaoguanling@360.cn
 * link:
 */
class GenericObjectPool<T>(private val factory: BasePooledObjectFactory<T>, config: GenericObjectPoolConfig) : Pools.Pool<T> {
    @Suppress("UNCHECKED_CAST")
    private var mPool: Array<T?> = arrayOfNulls<Any?>(config.maxTotal) as Array<T?>
    private var mPoolSize: AtomicInteger = AtomicInteger(0)
    private val mLock = Any()

    init {
        repeat(config.minIdle) {
            addObject()
        }
    }

    // 等待被使用的对象个数
    fun getIdleNum(): Int {
        return mPoolSize.get()
    }

    // 活跃的对象个数
    fun getActiveNum(): Int {
        return mPool.size - mPoolSize.get()
    }


    fun borrowObject(): T {
        return acquire()
    }

    fun returnObject(webView: T):Boolean {
        return release(webView)
    }

    fun addObject() {
        val webView = factory.create()
        release(webView)
    }

    override fun acquire(): T {
        synchronized(mLock) {
            return if (mPoolSize.get() > 0) {
                val lastPooledIndex = mPoolSize.get() - 1
                val instance = mPool[lastPooledIndex]
                mPool[lastPooledIndex] = null
                mPoolSize.decrementAndGet()
                instance!!
            } else {
                factory.create()
            }
        }
    }

    override fun release(instance: T): Boolean {
        synchronized(mLock) {
            return if (this.isInPool(instance)) {
                true
            } else if (mPoolSize.get() < mPool.size) {
                mPool[mPoolSize.get()] = instance
                mPoolSize.incrementAndGet()
                true
            } else {
                false
            }
        }
    }

    private fun isInPool(instance: T): Boolean {
        synchronized(mLock) {
            for (i in 0 until mPoolSize.get()) {
                if (mPool[i] === instance) {
                    return true
                }
            }
            return false
        }
    }
}