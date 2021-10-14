package com.cleo.codebase.cases

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.cleo.codebase.R

open class BaseCaseActivity : AppCompatActivity() {
    private lateinit var container: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initContentView()
        initView()
        initAction()

    }

    private fun initContentView() {
        setContentView(R.layout.activity_base_case)
        container = findViewById(R.id.container)
    }

    protected fun addCase(case: ActionButton) {
        container.addView(case)
    }

    protected open fun initView() {

    }

    private fun initAction() {

    }
}