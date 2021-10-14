package com.cleo.codebase.cases.loader

import com.cleo.codebase.cases.BaseCaseActivity

class ClassLoaderActivity : BaseCaseActivity() {
    companion object {
        const val tag = "ClassLoaderCases"
    }

    override fun initView() {
        addCase(LBHelloWorld(this))
        addCase(LBSubClass(this))
        addCase(LBActivityJava(this))
        addCase(LBActivityKt(this))
    }
}