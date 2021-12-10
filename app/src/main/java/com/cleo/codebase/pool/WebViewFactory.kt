package com.cleo.codebase.pool

import android.webkit.WebView
import com.cleo.codebase.CodeApplication

/**
 * author:gaoguanling
 * date:2021/12/9
 * time:19:25
 * email:gaoguanling@360.cn
 * link:
 */
class WebViewFactory : BasePooledObjectFactory<WebView> {
    @Throws(Exception::class)
    override fun create(): WebView {
        return WebView(CodeApplication.app)
    }
}