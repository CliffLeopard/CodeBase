package com.cleo.codebase.cases.service

import android.content.Context
import android.content.Intent
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/10/15
 * time:17:31
 * email:gaoguanling@360.cn
 * link:
 */
class BtnOpenService(context: Context) : ActionButton(context) {
    override fun initAction() {
        this.setOnClickListener {
            val intent = Intent(context, SimpleService::class.java)
            context.startService(intent)
        }
    }

    override fun labelName(): String {
        return "简单StartService"
    }
}