package com.cleo.codebase.cases.service

import android.app.Service
import android.content.Intent
import android.content.res.Configuration
import android.os.IBinder
import android.util.Log

class SimpleService : Service() {
    override fun onCreate() {
        Log.e(AboutServiceActivity.tag, "onCreate")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e(AboutServiceActivity.tag, "onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder? {
        Log.e(AboutServiceActivity.tag, "onBind")
        return null
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        Log.e(AboutServiceActivity.tag, "onConfigurationChanged")
        super.onConfigurationChanged(newConfig)
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        Log.e(AboutServiceActivity.tag, "onTaskRemoved")
        super.onTaskRemoved(rootIntent)
    }

    override fun onUnbind(intent: Intent?): Boolean {
        Log.e(AboutServiceActivity.tag, "onUnbind")
        return super.onUnbind(intent)
    }

    override fun onRebind(intent: Intent?) {
        Log.e(AboutServiceActivity.tag, "onRebind")
        super.onRebind(intent)
    }

    override fun onLowMemory() {
        Log.e(AboutServiceActivity.tag, "onLowMemory")
        super.onLowMemory()
    }

    override fun onTrimMemory(level: Int) {
        Log.e(AboutServiceActivity.tag, "onTrimMemory")
        super.onTrimMemory(level)
    }

    override fun onDestroy() {
        Log.e(AboutServiceActivity.tag, "onDestroy")
        super.onDestroy()
    }
}