package com.cleo.codebase.pool

/**
 * author:gaoguanling
 * date:2021/12/9
 * time:19:22
 * email:gaoguanling@360.cn
 * link:
 */
interface BasePooledObjectFactory<T> {
    @Throws(Exception::class)
    fun create(): T
}