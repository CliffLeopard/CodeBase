package com.cleo.codebase.cases.lam

import com.cleo.codebase.cases.BaseCaseActivity

class LambdaActivity : BaseCaseActivity() {
    override fun initView() {
        super.addCases(JavaLamCases.getAll(this))
        super.addCases(KotlinLamCases.getAll(this))
    }

    fun doNothing() {

    }
}