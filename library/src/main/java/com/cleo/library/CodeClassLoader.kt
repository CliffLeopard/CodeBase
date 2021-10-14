package com.cleo.library

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
        const val dexDir = "dex"
    }

    private val dynamicClass = mutableMapOf<String, DynamicClassData>()

    fun loadClassFromChildClassLoader(name: String?, resolve: Boolean): Class<*>? {
        return super.loadClass(name, resolve)
    }

    fun loadClassFromChildClassLoader(name: String?): Class<*>? {
        return super.loadClass(name)
    }

    fun getResourceFromChildClassLoader(name: String?): URL? {
        return super.getResource(name)
    }

    fun getResourcesFromChildClassLoader(name: String?): Enumeration<URL> {
        return super.getResources(name)
    }

    override fun loadClass(name: String?): Class<*>? {
        var clazz: Class<*>?
        try {
            clazz = super.loadClass(name)
        } catch (cnf: ClassNotFoundException) {
            val method = ReflectUtils.getMethod(son?.javaClass, "findClass", String::class.java)
            method.isAccessible = true
            clazz = method.invoke(son, name) as Class<*>?
        }
        return clazz
    }

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
        val tmp = arrayOfNulls<Enumeration<*>?>(2) as Array<Enumeration<URL>?>
        tmp[0] = super.getResources(name)
        val method = ReflectUtils.getMethod(son?.javaClass, "findResources", String::class.java)
        tmp[1] = method.invoke(son, name) as Enumeration<URL>?
        return sun.misc.CompoundEnumeration(tmp)
    }

    override fun findClass(name: String?): Class<*> {
        return super.findClass(name)
    }
}