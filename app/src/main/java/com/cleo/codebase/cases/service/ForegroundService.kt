package com.cleo.codebase.cases.service

import android.app.*
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.os.Build
import android.os.IBinder
import android.util.Log
import com.cleo.codebase.R

class ForegroundService : Service() {
    val id = 120
    private val channelId = "GGL"
    override fun onCreate() {
        Log.e(AboutServiceActivity.tag, "onCreate")
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Log.e(AboutServiceActivity.tag, "onStartCommand")
            val name = this.getString(R.string.channel_name)
            val descriptionText = this.getString(R.string.channel_description)
            val channel = NotificationChannel(channelId, name, NotificationManager.IMPORTANCE_DEFAULT).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                this.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)

            val pendingIntent: PendingIntent =
                Intent(this, AboutServiceActivity::class.java).let { notificationIntent ->
                    PendingIntent.getActivity(this, 0, notificationIntent, 0)
                }
            val notification: Notification = Notification.Builder(this, channelId)
//                .setContentTitle(getText(R.string.notification_title))
//                .setContentText(getText(R.string.notification_message))
//                .setSmallIcon(R.drawable.ic_launcher_foreground)
                .setContentIntent(pendingIntent)
//                .setTicker(getText(R.string.ticker_text))
                .build()

            startForeground(id, notification)
//            stopForeground(true)
        }
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