package com.cleo.codebase

import android.app.Application
import android.content.Context
import com.cleo.codebase.dynamic.DynamicActivityDump
import com.cleo.library.LibraryCenter

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:17:25
 * email:gaoguanling@360.cn
 * link:
 */
class CodeApplication : Application() {
    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        initLibrary()
    }

    private fun initLibrary() {
        LibraryCenter.initLibrary(this)
    }

    private fun addDynamicClassByAsm() {
        val name = "com/cleo/codebase/cases/start/DynamicActivity"
        val byteArray = DynamicActivityDump.dump()
    }
}