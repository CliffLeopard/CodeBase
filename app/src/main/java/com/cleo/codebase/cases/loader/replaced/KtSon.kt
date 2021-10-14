package com.cleo.codebase.cases.loader.replaced

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:18:33
 * email:gaoguanling@360.cn
 * link:
 */
class KtSon : Parent() {
    companion object {
        fun toStr(): String {
            return "KtSon-ClassLoader:" + KtSon::class.java.classLoader.toString()
        }
    }
    fun showLoader(): String {
        return this.javaClass.classLoader.toString()
    }
}