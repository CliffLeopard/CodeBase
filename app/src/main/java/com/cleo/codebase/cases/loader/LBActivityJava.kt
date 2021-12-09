package com.cleo.codebase.cases.loader

import android.content.Context
import android.content.Intent
import com.cleo.codebase.cases.ActionButton
import com.cleo.codebase.cases.loader.replaced.DyJavaActivity

/**
 * author:gaoguanling
 * date:2021/10/14
 * time:18:56
 * email:gaoguanling@360.cn
 * link:
 */
class LBActivityJava(context: Context) : ActionButton(context) {
    override fun initAction() {
        this.setOnClickListener {
            val intent = Intent(context, DyJavaActivity::class.java)
            context.startActivity(intent)
        }
    }
    override fun labelName(): String = "从Assets中加载JavaActivity"
}