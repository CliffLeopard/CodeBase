package com.cleo.codebase.cases.theme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebView
import com.cleo.codebase.R

class ThemeChangeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.CommonStyle2)
        setContentView(R.layout.activity_theme_change)
        val userAgent = System.getProperty("http.agent")
        Log.e("UA:",userAgent)
        val webView = WebView(this)
        Log.e("WebUA",webView.getSettings().getUserAgentString())
    }
}