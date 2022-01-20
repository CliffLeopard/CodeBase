package com.cleo.codebase.cases.lam

import android.util.Log
import android.view.View

/**
 * author:gaoguanling
 * date:2022/1/20
 * time:13:34
 * email:gaoguanling@360.cn
 * link:
 */
class Target(private val message: String) {
    fun target5(view: View) {
        Log.e(LamConstant.tag, "Click Me: $message")
    }
    companion object {
        @JvmStatic
        fun target6(view: View) {
            Log.e(LamConstant.tag, "target6")
        }
        fun target7(view: View) {
            Log.e(LamConstant.tag, "target7")
        }
    }
}