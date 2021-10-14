package com.cleo.codebase.cases.start

import android.content.ComponentName
import android.content.Context
import android.content.Intent

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:12:49
 * email:gaoguanling@360.cn
 * link:
 */
class StartButton5(context: Context) : StartButton(context) {
    override fun getIntent(): Intent {
        val intent = Intent()
        intent.component = ComponentName(context, "com.cleo.codebase.cases.loader.replaced.DyJavaActivity")
        return intent
    }
}