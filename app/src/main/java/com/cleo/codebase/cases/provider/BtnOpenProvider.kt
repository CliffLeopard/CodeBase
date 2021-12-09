package com.cleo.codebase.cases.provider

import android.content.Context
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/10/15
 * time:18:14
 * email:gaoguanling@360.cn
 * link:
 */
class BtnOpenProvider(context: Context):ActionButton(context) {
    override fun initAction() {

    }

    override fun labelName(): String = "简单打开Provider"
}