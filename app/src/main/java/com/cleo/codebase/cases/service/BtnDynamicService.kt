package com.cleo.codebase.cases.service

import android.content.Context
import android.content.Intent
import com.cleo.codebase.Data
import com.cleo.codebase.cases.ActionButton
import com.cleo.library.LibraryCenter

/**
 * author:gaoguanling
 * date:2021/10/15
 * time:17:45
 * email:gaoguanling@360.cn
 * link:
 */
class BtnDynamicService(context: Context) : ActionButton(context) {
    override fun initAction() {
        setOnClickListener {
            val intent = Intent()
            intent.setClassName(
                Data.pkgName,
                "com.cleo.codebase.cases.service.DynamicService"
            )
            LibraryCenter.startService(context,intent)
        }
    }

    override fun labelName(): String {
        return "打开通过Assets加载的Service"
    }
}