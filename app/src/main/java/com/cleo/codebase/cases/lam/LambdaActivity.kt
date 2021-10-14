package com.cleo.codebase.cases.lam

import com.cleo.codebase.cases.BaseCaseActivity

class LambdaActivity : BaseCaseActivity() {
    override fun initView() {
        super.addCase(LambdaCase1(this))
        super.addCase(LambdaCase2(this))
        super.addCase(LambdaCase3(this))
        super.addCase(LambdaCase4(this))
        super.addCase(LambdaCase5(this))
    }
}