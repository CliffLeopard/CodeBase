package com.cleo.codebase.cases.lam

import android.content.Context
import android.util.Log
import android.view.View
import com.cleo.codebase.WrapperCenter
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:16:00
 * email:gaoguanling@360.cn
 * link:
 */
class LambdaCase2(context: Context) : LambdaCase(context) {
    override fun initAction() {
        this.setOnClickListener { Log.e(LamConstant.tag, "Click Me:$text") }
    }

    override fun asmCreateFunction(view: View) {
        WrapperCenter.wrapOnClickBefore(view)
        targetFunc(view)
        WrapperCenter.wrapOnClickAfter(view)
    }

    fun initAction2() {
        this.setOnClickListener(LambdaCase2::targetFunc)
    }

    companion object {
        @JvmStatic
        private fun targetFunc(view: View) {
            Log.e(LamConstant.tag, "targetFunc Click Me")
        }
    }
}