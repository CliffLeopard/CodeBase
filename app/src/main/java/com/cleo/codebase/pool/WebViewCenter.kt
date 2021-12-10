package com.cleo.codebase.pool

import android.os.Handler
import android.os.Looper
import android.util.Log
import android.webkit.WebView


/**
 * author:gaoguanling
 * date:2021/12/9
 * time:19:24
 * email:gaoguanling@360.cn
 * link:
 */
object WebViewCenter {
    private lateinit var pool: GenericObjectPool<WebView>
    private const val TAG = "WebViewCenter"


    /**
     * 插件调用 预加载一个WebView
     */
    fun prePareWebView() {
        initPool()
        if (pool.getIdleNum() == 0) try {
            pool.addObject()
        } catch (ignore: Exception) {
        }
    }

    private fun initPool() {
        val config = GenericObjectPoolConfig(3, 1, 1)
        pool = GenericObjectPool(WebViewFactory(), config)
    }

    fun getWebView(): WebView? {
        var webView: WebView?
        try {
            webView = pool.borrowObject()
        } catch (ignore: Exception) {
            webView = null
            Log.d(TAG, "无空闲WebView供使用")
        }
        return webView
    }

    /**
     * WebView回收
     */
    fun returnWebView(webView: WebView) {
        webView.loadUrl("about:blank")
        clearHandler.postDelayed({
            webView.clearCache(true)
            webView.clearHistory()
            webView.clearFormData()
            webView.clearMatches()
            webView.clearSslPreferences()
            webView.clearFocus()
            webView.clearHistory()
            if (!pool.returnObject(webView)) {
                webView.destroy()
            }
        }, 500)
    }

    val clearHandler = Handler(Looper.getMainLooper())
}