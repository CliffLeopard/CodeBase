package com.cleo.codebase.cases.lam

import android.content.Context
import android.util.Log
import android.view.View
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:15:56
 * email:gaoguanling@360.cn
 * link:
 * 匿名内部类，非lambda表达式
 */
class LambdaCase1(context: Context) : LambdaCase(context) {
    override fun initAction() {
        this.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                Log.e(LamConstant.tag, "Click Me:$text")
            }
        })
    }

    override fun asmCreateFunction(view:View) {

    }
}