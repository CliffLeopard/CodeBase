package com.cleo.codebase.webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.lifecycleScope
import androidx.webkit.WebViewClientCompat
import androidx.webkit.WebViewCompat
import androidx.webkit.WebViewFeature
import com.cleo.codebase.databinding.ActivityBrowserBinding

class BrowserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBrowserBinding
    private var safeBrowsingIsInitialized: Boolean = false
    private var scale = 1.0f
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrowserBinding.inflate(layoutInflater)
        setContentView(binding.root)
        WebView.enableSlowWholeDocumentDraw();
        setContentView(binding.root)
        configWebView()
        initAction()
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun configWebView() {
        binding.web.settings.apply {
            javaScriptEnabled = true
            blockNetworkLoads = false
            setGeolocationEnabled(true)
            databaseEnabled = true
            domStorageEnabled = true
            loadWithOverviewMode = true
            useWideViewPort = true
            setSupportZoom(true)
            layoutAlgorithm = WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING
            cacheMode = WebSettings.LOAD_CACHE_ELSE_NETWORK
        }

        binding.web.webViewClient = object : WebViewClientCompat() {
            override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
                return false //super.shouldOverrideUrlLoading(view, request)
            }

            override fun onScaleChanged(view: WebView?, oldScale: Float, newScale: Float) {
                scale = newScale
                super.onScaleChanged(view, oldScale, newScale)
            }
        }
        binding.web.webChromeClient = WebChromeClient().apply {

        }
        safeBrowsingIsInitialized = false
        if (WebViewFeature.isFeatureSupported(WebViewFeature.START_SAFE_BROWSING)) {
            WebViewCompat.startSafeBrowsing(this) { success ->
                safeBrowsingIsInitialized = true
                if (!success) {
                    Log.e(TAG, "Unable to initialize Safe Browsing!")
                }
            }
        }

        // 查看当前WebPackage的信息
        val webViewPackageInfo = WebViewCompat.getCurrentWebViewPackage(applicationContext)
        Log.d(TAG, "WebView version: ${webViewPackageInfo?.versionName ?: "empty"}")
    }

    private fun initAction() {
        binding.button.setOnClickListener {
            CaptureHelper.capture(lifecycleScope, binding.web, scale)
        }
        binding.web.loadUrl("https://www.baidu.com")
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK && binding.web.canGoBack()) {
            binding.web.goBack()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }

    companion object {
        private const val TAG = "Browser"
    }
}