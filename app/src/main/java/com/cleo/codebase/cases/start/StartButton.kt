package com.cleo.codebase.cases.start

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.View
import com.cleo.codebase.cases.ActionButton

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:16:55
 * email:gaoguanling@360.cn
 * link:
 */
abstract class StartButton(context: Context) : ActionButton(context) {
    override fun initAction() {
        this.setOnClickListener(this::onClick)
    }

    abstract fun getIntent(): Intent

    private fun onClick(view: View) {
        val intent = getIntent()
        printLog(intent)
        context.startActivity(intent)
    }

    private fun printLog(intent: Intent) {
        val componentName = intent.component!!
        Log.e(
            "ButtonStartActivity",
            "className:${componentName.className}   packageName:${componentName.packageName}  shortClassName:${componentName.shortClassName} "
        )
    }
}