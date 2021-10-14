package com.cleo.codebase.cases.start

import com.cleo.codebase.cases.BaseCaseActivity

class StartActivity : BaseCaseActivity() {
    override fun initView() {
        super.addCase(StartButton1(this))
        super.addCase(StartButton2(this))
        super.addCase(StartButton3(this))
        super.addCase(StartButton4(this))
        super.addCase(StartButton5(this))
    }
}