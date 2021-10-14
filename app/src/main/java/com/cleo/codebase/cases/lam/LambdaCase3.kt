package com.cleo.codebase.cases.lam

import android.content.Context
import android.util.Log
import android.view.View
import com.cleo.codebase.WrapperCenter
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:16:07
 * email:gaoguanling@360.cn
 * link:
 */
class LambdaCase3(context: Context) : LambdaCase(context) {
    override fun initAction() {
        this.setOnClickListener(::case3OnClick)
    }

    override fun asmCreateFunction(view: View) {
        WrapperCenter.wrapOnClickBefore(view)
        case3OnClick(view)
        WrapperCenter.wrapOnClickAfter(view)
    }

    private fun case3OnClick(view: View) {
        Log.e(LamConstant.tag, "Click Me:$text")
    }
}