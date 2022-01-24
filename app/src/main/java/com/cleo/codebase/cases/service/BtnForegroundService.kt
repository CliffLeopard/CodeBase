package com.cleo.codebase.cases.service

import android.content.Context
import android.content.Intent
import android.os.Build
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2022/1/24
 * time:10:53
 * email:gaoguanling@360.cn
 * link:
 */
class BtnForegroundService(context: Context) : ActionButton(context) {
    override fun initAction() {
        this.setOnClickListener {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                val intent = Intent(context,ForegroundService::class.java)
                context.startForegroundService(intent)
//                context.startService(intent)
            }
        }
    }

    override fun labelName(): String {
        return "打开前台Service"
    }
}