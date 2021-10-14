package com.cleo.codebase.cases.start

import android.content.Context
import android.content.Intent

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:16:49
 * email:gaoguanling@360.cn
 * link:
 */
class StartButton2(context: Context) : StartButton(context) {
    override fun getIntent(): Intent {
        val intent = Intent()
        intent.setClass(context, TargetActivity::class.java)
        return intent
    }
}