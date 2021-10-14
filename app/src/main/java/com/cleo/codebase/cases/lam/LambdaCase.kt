package com.cleo.codebase.cases.lam

import android.content.Context
import android.view.View
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:16:43
 * email:gaoguanling@360.cn
 * link:
 */
abstract class LambdaCase(context: Context):ActionButton(context) {
    abstract fun asmCreateFunction(view: View)
}