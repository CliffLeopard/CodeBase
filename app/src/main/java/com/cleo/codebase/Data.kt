package com.cleo.codebase

import com.cleo.codebase.cases.GlideActivity
import com.cleo.codebase.cases.broad.AboutBroadActivity
import com.cleo.codebase.cases.lam.LambdaActivity
import com.cleo.codebase.cases.loader.ClassLoaderActivity
import com.cleo.codebase.cases.provider.AboutProviderActivity
import com.cleo.codebase.cases.service.AboutServiceActivity
import com.cleo.codebase.cases.start.StartActivity
import com.cleo.codebase.cases.theme.ThemeChangeActivity

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
        "ClassLoaderCases" to ClassLoaderActivity::class.java.name,
        "关于Service" to AboutServiceActivity::class.java.name,
        "关于BroadCastReceiver" to AboutBroadActivity::class.java.name,
        "关于ContentProvider" to AboutProviderActivity::class.java.name,
        "关于主题资源" to ThemeChangeActivity::class.java.name,
        "Glide" to GlideActivity::class.java.name
    )
    const val pkgName = "com.cleo.codebase"
}