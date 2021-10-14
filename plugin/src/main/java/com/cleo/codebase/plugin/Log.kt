package com.cleo.codebase.plugin

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:14:54
 * email:gaoguanling@360.cn
 * link:
 */
object Log {
    fun i(tag: String, msg: String) {
        println("[$tag] $msg")
    }

    fun detail(tag: String, msg: String) {
        println("[$tag] $msg")
    }

    fun e(tag: String, msg: String) {
        System.err.println("[$tag] $msg")
    }
}