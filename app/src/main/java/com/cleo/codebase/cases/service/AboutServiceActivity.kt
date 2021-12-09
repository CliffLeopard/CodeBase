package com.cleo.codebase.cases.service

import com.cleo.codebase.cases.BaseCaseActivity

class AboutServiceActivity : BaseCaseActivity() {
    companion object {
        const val tag = "CodeService"
    }

    override fun initView() {
        super.addCase(BtnOpenService(this))
        super.addCase(BtnDynamicService(this))
    }
}