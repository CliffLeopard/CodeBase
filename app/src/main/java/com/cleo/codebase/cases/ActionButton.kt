package com.cleo.codebase.cases

import android.content.Context
import android.text.TextUtils
import android.view.Gravity
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import androidx.appcompat.widget.AppCompatButton
import com.cleo.codebase.R

/**
 * author:gaoguanling
 * date:2021/9/30
 * time:15:47
 * email:gaoguanling@360.cn
 * link:
 */
abstract class ActionButton(context: Context) : AppCompatButton(context) {
    init {
        height = context.resources.getDimension(R.dimen.case_size).toInt()
        width = MATCH_PARENT
        gravity = Gravity.CENTER
        call()
    }

    private fun call() {
        initAction()
        val tittle = getTittle()
        text = if (TextUtils.isEmpty(tittle)) labelName() else tittle
    }

    abstract fun initAction()
    open fun labelName(): String = this.javaClass.name
    protected open fun getTittle(): String {
        return ""
    }
}