package com.cleo.library

import android.content.Context
import com.cleo.library.util.AssetsHelper
import com.cleo.library.util.ReflectUtils
import java.io.File
import java.io.FileOutputStream

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:17:31
 * email:gaoguanling@360.cn
 * link:
 */
object LibraryCenter {

    private val dexFiles = setOf(
        "d8-hello.dex",
        "d8-son.dex",
        "d8-ktson.dex",
        "d8-java-activity.dex",
        "d8-kt-activity.dex"
    )

    fun initLibrary(context: Context) {
        AssetsHelper.initAssets(context)
        val systemClassLoader = this.javaClass.classLoader
        val dexPath = addDynamicClassByDx(context)
        val codeClassLoader =
            LogClassLoader(dexPath, systemClassLoader, systemClassLoader?.parent)
        val shadowClassLoader = ShadowClassLoader(codeClassLoader)
        setClassLoader(systemClassLoader, shadowClassLoader)
    }

    private fun setClassLoader(son: ClassLoader?, parent: ClassLoader) {
        val field = ReflectUtils.getField(son?.javaClass, "parent")
        field.isAccessible = true
        field.set(son, parent)
    }

    private fun addDynamicClassByDx(context: Context): String {
        var dexPaths = ""
        dexFiles.forEach { dexFileName ->
            val byteArray = AssetsHelper.readAssets(dexFileName)!!
            val cacheDir = context.cacheDir
            val file = File(cacheDir.absolutePath + File.separator + CodeClassLoader.dexDir)
            if (!file.exists()) {
                file.mkdirs()
            }
            val dexPath = file.absolutePath + File.separator + dexFileName
            dexPaths = dexPaths + dexPath + File.pathSeparator
            FileOutputStream(dexPath).use {
                it.write(byteArray)
            }
        }
        return dexPaths.removeSuffix(File.pathSeparator)
    }
}