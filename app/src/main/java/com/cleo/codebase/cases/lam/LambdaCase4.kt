package com.cleo.codebase.cases.lam

import android.content.Context
import android.view.View
import com.cleo.codebase.WrapperCenter
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:16:09
 * email:gaoguanling@360.cn
 * link:
 */
class LambdaCase4(context: Context) : LambdaCase(context) {
    override fun initAction() {
        this.setOnClickListener(LamConstant::case4OnClick)
    }
    
    override fun asmCreateFunction(view: View) {
        WrapperCenter.wrapOnClickBefore(view)
        LamConstant.case4OnClick(view)
        WrapperCenter.wrapOnClickAfter(view)
    }
}