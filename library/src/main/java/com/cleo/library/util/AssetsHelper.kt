package com.cleo.library.util

import android.annotation.SuppressLint
import android.content.Context
import java.io.BufferedInputStream

/**
 * author:gaoguanling
 * date:2021/10/11
 * time:10:23
 * email:gaoguanling@360.cn
 * link:
 */
@SuppressLint("StaticFieldLeak")
object AssetsHelper {
    lateinit var context: Context
    fun initAssets(context: Context) {
        AssetsHelper.context = context
    }

    fun readAssets(filePath: String): ByteArray? {
        return readAssets(context, filePath)
    }

    private fun readAssets(context: Context, filePath: String): ByteArray? {
        val assetsManager = context.assets
        val absolutePath = "file:///android_asset/$filePath"
        var byteArray: ByteArray? = null
        assetsManager.open(filePath).use { inputStream ->
            BufferedInputStream(inputStream).use { bfStream ->
                byteArray = bfStream.readBytes()
            }
        }
        return byteArray
    }
}