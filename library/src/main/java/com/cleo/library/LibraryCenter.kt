package com.cleo.library

import android.content.Context
import android.content.Intent
import com.cleo.library.loader.CodeClassLoader
import com.cleo.library.loader.LogClassLoader
import com.cleo.library.loader.ShadowClassLoader
import com.cleo.library.util.AssetsHelper
import com.cleo.library.util.ReflectUtils
import java.io.File

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:17:31
 * email:gaoguanling@360.cn
 * link:
 */
object LibraryCenter {
    private const val cacheDexDir = "dex"
    private const val assetsDexDir = "plugins"
    private lateinit var codeClassLoader: CodeClassLoader
    private val dynamicActivities = mapOf(
        "com.cleo.codebase.cases.loader.replaced.DyKtActivity" to "this.is.dynamic.activity",
        "com.cleo.codebase.cases.service.DynamicService"       to "this.is.dynamic.service"
    )

    fun initLibrary(context: Context) {
        AssetsHelper.initAssets(context)
        changeClassLoader()
        dynamicActivities.forEach { (targetName, placeHolderName) ->
            addDynamicActivity(placeHolderName, targetName)
        }
    }

    fun startService(context: Context,intent: Intent) {
        val componentName = intent.component
        if (componentName != null) {
            val className = componentName.className
            if (dynamicActivities.containsKey(className)) {
                val newClassName = dynamicActivities[className]!!
                intent.setClassName(componentName.packageName, newClassName)
            }
        }
        context.startService(intent)
    }

    fun startActivity(context: Context, intent: Intent) {
        val componentName = intent.component
        if (componentName != null) {
            val className = componentName.className
            if (dynamicActivities.containsKey(className)) {
                val newClassName = dynamicActivities[className]!!
                intent.setClassName(componentName.packageName, newClassName)
            }
        }
        context.startActivity(intent)
    }

    private fun addDynamicActivity(placeHolderName: String, targetName: String) {
        codeClassLoader.addDynamicActivity(placeHolderName, targetName)
    }

    // 形成 PathClassLoader --> ShadowClassLoader --> CodeClassLoader 的层级加载逻辑
    private fun changeClassLoader() {
        val systemClassLoader = this.javaClass.classLoader
        val dexPath = addDynamicClassByDx()
        codeClassLoader =
            LogClassLoader(dexPath, systemClassLoader, systemClassLoader?.parent)
        val shadowClassLoader = ShadowClassLoader(codeClassLoader)

        val field = ReflectUtils.getField(systemClassLoader?.javaClass, "parent")
        field.isAccessible = true
        field.set(systemClassLoader, shadowClassLoader)
    }

    /**
     * 将assets中的文件复制到应用私有存储空间，并返回合并后的文件路径地址
     */
    private fun addDynamicClassByDx(): String {
        var dexPaths = ""
        AssetsHelper.copyAssetsPathToCache(assetsDexDir, cacheDexDir)?.forEach {
            dexPaths = dexPaths + it + File.pathSeparator
        }
        return dexPaths.removeSuffix(File.pathSeparator)
    }
}