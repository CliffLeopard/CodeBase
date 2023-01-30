package com.cleo.library.loader

import com.cleo.library.util.ReflectUtils
import dalvik.system.PathClassLoader
import java.net.URL
import java.util.*

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:17:29
 * email:gaoguanling@360.cn
 * link:
 * PathClassLoader -> ShadowClassLoader -> CodeClassLoader -> BootClassLoader
 */
open class CodeClassLoader(dexPath: String, private val son: ClassLoader?, parent: ClassLoader?) :
    PathClassLoader(dexPath, parent) {
    companion object {
        const val tag = "CodeClassLoader"
    }

    private val dynamicClass = mutableMapOf<String, DynamicClassData>()

    fun addDynamicActivity(placeHolderName: String, targetName: String) {
        dynamicClass[placeHolderName] = DynamicClassData(placeHolderName, targetName)
    }

    fun loadClassFromChildClassLoader(name: String?, resolve: Boolean): Class<*>? {
        return super.loadClass(name, resolve)
    }

    fun getResourceFromChildClassLoader(name: String?): URL? {
        return super.getResource(name)
    }

    fun getResourcesFromChildClassLoader(name: String?): Enumeration<URL> {
        return super.getResources(name)
    }

    /**
     * 当通过CodeClassLoader加载的类中加载新的类时，只会向上和本ClassLoader查找，不经原有的PathClassLoader
     * 这就造成了，很多在PathLoader的dexPath中的类不能正常加载
     *
     * 所以使用ShadowClassLoader进行截断。
     * 这样只有在通过CodeClassLoader加载的类中加载新的类才会调用loadClass方法
     * 重载loadClass方法，正常路径找不到类时，调用PathClassLoader的findClass方法，补充成为原始的加载逻辑。
     *
     * 正常通过PathClassLoader查找时会走 loadClassFromChildClassLoader 方法，则不需要向下查找
     *
     * @param name: 类名
     * @param resolve: kk
     */
    override fun loadClass(name: String?, resolve: Boolean): Class<*>? {
        var clazz: Class<*>?
        try {
            clazz = super.loadClass(name, resolve)
        } catch (cnf: ClassNotFoundException) {
            val method = ReflectUtils.getMethod(son?.javaClass, "findClass", String::class.java)
            method.isAccessible = true
            clazz = method.invoke(son, name) as Class<*>?
        }
        return clazz
    }


    override fun getResource(name: String?): URL? {
        var url = super.getResource(name)
        if (url == null) {
            val method = ReflectUtils.getMethod(son?.javaClass, "findResource", String::class.java)
            url = method.invoke(son, name) as URL?
        }
        return url
    }

    override fun getResources(name: String?): Enumeration<URL> {
        val tmp = arrayOfNulls<Enumeration<URL>?>(2)
        tmp[0] = super.getResources(name)
        val method = ReflectUtils.getMethod(son?.javaClass, "findResources", String::class.java)
        tmp[1] = method.invoke(son, name) as Enumeration<URL>?
        return CompoundEnumeration(tmp)
    }

    override fun findClass(name: String?): Class<*> {
        dynamicClass[name]?.let {
            return super.findClass(it.targetName)
        }
        return super.findClass(name)
    }
}