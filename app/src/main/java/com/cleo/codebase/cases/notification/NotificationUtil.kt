package com.cleo.codebase.cases.notification

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import com.cleo.codebase.R

/**
 * author:gaoguanling
 * date:2022/1/24
 * time:11:12
 * email:gaoguanling@360.cn
 * link:
 */
object NotificationUtil {
    fun createNotificationChannel(context: Context) {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            val CHANNEL_ID = context.getString(R.string.channel_id)

            val importance = NotificationManager.IMPORTANCE_DEFAULT

        }
    }

}