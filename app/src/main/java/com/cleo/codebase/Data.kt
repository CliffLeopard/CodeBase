package com.cleo.codebase

import com.cleo.codebase.cases.GlideActivity
import com.cleo.codebase.cases.broad.AboutBroadActivity
import com.cleo.codebase.cases.lam.LambdaActivity
import com.cleo.codebase.cases.loader.ClassLoaderActivity
import com.cleo.codebase.cases.provider.AboutProviderActivity
import com.cleo.codebase.cases.service.AboutServiceActivity
import com.cleo.codebase.cases.start.StartActivity
import com.cleo.codebase.cases.theme.ThemeChangeActivity
import com.cleo.codebase.cases.web.WebViewActivity
import com.cleo.codebase.coroutine.CoroutineActivity
import com.cleo.codebase.coroutine.channel.ChannelActivity
import com.cleo.codebase.coroutine.flow.FlowActivity
import com.cleo.codebase.event.TouchEventActivity
import com.cleo.codebase.webview.BrowserActivity

/**
 * author:gaoguanling
 * date:2021/9/28
 * time:15:41
 * email:gaoguanling@360.cn
 * link:
 */
object Data {
    val cases = listOf(
        "LambdaMethodHook" to LambdaActivity::class.java.name,
        "插件Activity启动方式" to StartActivity::class.java.name,
        "ClassLoader Activity和普通类" to ClassLoaderActivity::class.java.name,
        "Service测试用例" to AboutServiceActivity::class.java.name,
        "BroadCastReceiver测试用例" to AboutBroadActivity::class.java.name,
        "ContentProvider测试用例" to AboutProviderActivity::class.java.name,
        "关于主题资源" to ThemeChangeActivity::class.java.name,
        "Glide" to GlideActivity::class.java.name,
        "WebView池化问题" to WebViewActivity::class.java.name,
        "协程" to CoroutineActivity::class.java.name,
        "Flow" to FlowActivity::class.java.name,
        "Chanel" to ChannelActivity::class.java.name,
        "WebView" to BrowserActivity::class.java.name,
        "TouchEvent" to TouchEventActivity::class.java.name
    )
    const val pkgName = "com.cleo.codebase"
}