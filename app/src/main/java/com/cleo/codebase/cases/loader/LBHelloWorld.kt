package com.cleo.codebase.cases.loader

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.cleo.codebase.cases.ActionButton
import com.cleo.codebase.cases.loader.replaced.HelloWorld
import com.google.android.material.snackbar.Snackbar

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:17:52
 * email:gaoguanling@360.cn
 * link:
 * 简单的类替换，
 * 这里调用的 HelloWorld实际为CodeClassLoader加载的assets目录中的dex文件。
 * 这些dex文件是通过d8编译器直接编译单个类的Class文件生成
 */
class LBHelloWorld(context: Context) : ActionButton(context) {
    @SuppressLint("ShowToast")
    override fun initAction() {
        this.setOnClickListener {
            Log.e(ClassLoaderActivity.tag, "HelloWord:ClassLoader:${HelloWorld.toStr()}")
            Snackbar.make(this, "HelloWord:ClassLoader:${HelloWorld.toStr()}", Snackbar.LENGTH_LONG)
                .show()
        }
    }
}