package com.cleo.codebase.cases.start

import android.content.Context
import android.content.Intent

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:16:43
 * email:gaoguanling@360.cn
 * link:
 */
class StartButton1(context: Context) : StartButton(context) {
    override fun getIntent(): Intent {
        return Intent(context, TargetActivity::class.java)
    }
}