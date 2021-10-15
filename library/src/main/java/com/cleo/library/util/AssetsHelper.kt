package com.cleo.library.util

import android.annotation.SuppressLint
import android.content.Context
import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream

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

    fun copyAssetsPathToCache(assetsDirectoryName: String, cacheDirectory: String): List<String>? {
        return getFilesFromAssetsPath(assetsDirectoryName)?.mapNotNull { assetsFileName ->
            copyAssetsFileToCache(assetsFileName, assetsDirectoryName, cacheDirectory)
        }
    }

    private fun copyAssetsFileToCache(
        assetsFileName: String,
        assetsDirectoryName: String?,
        cacheDirectory: String
    ): String? {
        val byteArray = readAssets(assetsDirectoryName, assetsFileName) ?: return null
        val cacheDir = context.cacheDir
        val file = File(cacheDir.absolutePath + File.separator + cacheDirectory)
        if (!file.exists()) {
            file.mkdirs()
        }
        val dexPath = File(file.absolutePath + File.separator + assetsFileName)
        FileOutputStream(dexPath).use {
            it.write(byteArray)
        }
        return dexPath.absolutePath
    }

    private fun getFilesFromAssetsPath(path: String): Array<String>? {
        val assetManager = context.assets
        return assetManager.list(path)
    }

    private fun readAssets(filePath: String?, fileName: String): ByteArray? {
        val assetsManager = context.assets
        var byteArray: ByteArray?
        val fileFullPath =
            if (filePath.isNullOrEmpty()) fileName else filePath + File.separator + fileName
        assetsManager.open(fileFullPath).use { inputStream ->
            BufferedInputStream(inputStream).use { bfStream ->
                byteArray = bfStream.readBytes()
            }
        }
        return byteArray
    }
}