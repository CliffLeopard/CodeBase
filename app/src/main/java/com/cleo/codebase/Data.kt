package com.cleo.codebase

import com.cleo.codebase.cases.CaseActivity01
import com.cleo.codebase.cases.lam.LambdaActivity
import com.cleo.codebase.cases.loader.ClassLoaderActivity
import com.cleo.codebase.cases.start.StartActivity

/**
 * author:gaoguanling
 * date:2021/9/28
 * time:15:41
 * email:gaoguanling@360.cn
 * link:
 */
object Data {
    val cases = listOf(
        "LambdaActivity" to LambdaActivity::class.java.name,
        "StartActivity" to StartActivity::class.java.name,
        "CaseActivity01" to CaseActivity01::class.java.name,
        "ClassLoaderCases" to ClassLoaderActivity::class.java.name
    )
    const val pkgName = "com.cleo.codebase"
}