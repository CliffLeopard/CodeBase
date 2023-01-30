package com.cleo.codebase.cases.web

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import com.cleo.codebase.R
import com.cleo.codebase.pool.WebViewCenter

class WebViewActivity : AppCompatActivity() {
    private lateinit var container: LinearLayoutCompat
    private var nowWebView: WebView? = null
    private val webViews = mutableListOf<WebView>()
    private val url = "https://www.baidu.com/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        container = findViewById(R.id.containerLayout)
    }

    fun goBack(view: View) {
        onBackPressed()
    }

    fun goBackPage(view: View) {
        super.onBackPressed()
    }

    fun addWebView(view: View) {
        val webView = WebViewCenter.getWebView()

        webView?.let {
            nowWebView = it
            webViews.add(webView)
            val param = ViewGroup.LayoutParams(MATCH_PARENT, MATCH_PARENT)
            container.addView(it, param)
            initWebView(it)
        }
    }

    override fun onBackPressed() {
        if (webViewCanGoBack()) {
            nowWebView?.goBack()
        } else {
            super.onBackPressed()
        }
    }

    private fun webViewCanGoBack(): Boolean {
        val canGoBack = nowWebView?.url != url
        if (canGoBack)
            nowWebView?.url?.let { Log.e("GGL", it) }
        return canGoBack
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initWebView(webView: WebView) {
        webView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
        webView.loadUrl(url)
        webView.webViewClient = MWebViewClient()
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.javaScriptCanOpenWindowsAutomatically = true
        webSettings.databaseEnabled = true
    }

    inner class MWebViewClient : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
            view.loadUrl(request.url.toString())
            return true
        }
    }

    override fun onDestroy() {
        webViews.forEach {
            container.removeView(it)
            WebViewCenter.returnWebView(it)
        }
        super.onDestroy()
    }
}