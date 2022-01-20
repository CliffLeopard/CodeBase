package com.cleo.codebase

import android.util.Log
import android.view.View
import com.cleo.codebase.cases.lam.LamConstant

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:13:32
 * email:gaoguanling@360.cn
 * link:
 */
object WrapperCenter {
    @JvmStatic
    fun wrapOnClickBefore(view: View) {
        Log.e(LamConstant.tag, "wrapOnClickBefore")
    }

    @JvmStatic
    fun wrapOnClickAfter(view: View) {
        Log.e(LamConstant.tag, "wrapOnClickAfter")
    }

    @JvmStatic
    fun doNothing(view:View){

    }
}