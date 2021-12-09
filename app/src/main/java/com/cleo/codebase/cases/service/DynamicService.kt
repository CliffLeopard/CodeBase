package com.cleo.codebase.cases.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class DynamicService : Service() {
    override fun onCreate() {
        super.onCreate()
        Log.e(AboutServiceActivity.tag, "来自内部的DynamicService onCreate")
        Toast.makeText(this, "来自内部的DynamicService", Toast.LENGTH_SHORT).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.e(AboutServiceActivity.tag, "来自内部的DynamicService onStartCommand")
        Toast.makeText(this, "来自内部的DynamicService onStartCommand", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}