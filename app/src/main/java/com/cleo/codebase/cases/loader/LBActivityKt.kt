package com.cleo.codebase.cases.loader

import android.content.Context
import android.content.Intent
import com.cleo.codebase.Data
import com.cleo.codebase.cases.ActionButton
import com.cleo.library.LibraryCenter

/**
 * author:gaoguanling
 * date:2021/10/14
 * time:18:37
 * email:gaoguanling@360.cn
 * link:
 * 使用CodeClassLoader,加载assets中的Activity dex
 */
class LBActivityKt(context: Context) : ActionButton(context) {
    override fun initAction() {
        this.setOnClickListener {
            val intent = Intent()
            intent.setClassName(
                Data.pkgName,
                "com.cleo.codebase.cases.loader.replaced.DyKtActivity" //"com.cleo.codebase.cases.loader.replaced.DyKtActivity"
            )
            LibraryCenter.startActivity(context, intent)
        }
    }

    override fun labelName(): String = "从Assets中加载KotlinActivity"
}