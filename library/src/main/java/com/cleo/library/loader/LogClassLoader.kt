package com.cleo.library.loader

import java.io.InputStream
import java.net.URL
import java.util.*

/**
 * author:gaoguanling
 * date:2021/10/9
 * time:17:38
 * email:gaoguanling@360.cn
 * link:
 */
class LogClassLoader(dexPath: String, son: ClassLoader?, parent: ClassLoader?) :
    CodeClassLoader(dexPath, son, parent) {
    companion object {
        const val tag = "LogClassLoader"
    }

    override fun loadClass(name: String?, resolve: Boolean): Class<*>? {
//        Log.e(tag, "loadClass:$name  $resolve")
        return super.loadClass(name, resolve)
    }

    override fun findClass(name: String?): Class<*> {
//        Log.e(tag, "findClass:$name")
        return super.findClass(name)
    }

    override fun findLibrary(libname: String?): String {
//        Log.e(tag, "findLibrary:$libname")
        return super.findLibrary(libname)
    }

    override fun getResource(name: String?): URL? {
//        Log.e(tag, "getResource:$name")
        return super.getResource(name)
    }

    override fun getResources(name: String?): Enumeration<URL> {
        return super.getResources(name)
    }

    override fun getResourceAsStream(name: String?): InputStream {
//        Log.e(tag, "getResourceAsStream:$name")
        return super.getResourceAsStream(name)
    }

    override fun findResource(name: String?): URL {
//        Log.e(tag, "findResource:$name")
        return super.findResource(name)
    }

    override fun findResources(name: String?): Enumeration<URL> {
//        Log.e(tag, "findResources:$name")
        return super.findResources(name)
    }

    override fun getPackage(name: String?): Package {
//        Log.e(tag, "getPackage: $name")
        return super.getPackage(name)
    }

    override fun getPackages(): Array<Package> {
//        Log.e(tag, "getPackages:")
        return super.getPackages()
    }


    override fun definePackage(
        name: String?,
        specTitle: String?,
        specVersion: String?,
        specVendor: String?,
        implTitle: String?,
        implVersion: String?,
        implVendor: String?,
        sealBase: URL?
    ): Package {
//        Log.e(tag, "definePackage: $name  $specTitle")
        return super.definePackage(
            name,
            specTitle,
            specVersion,
            specVendor,
            implTitle,
            implVersion,
            implVendor,
            sealBase
        )
    }

    override fun setDefaultAssertionStatus(enabled: Boolean) {
//        Log.e(tag, "setDefaultAssertionStatus:$enabled")
        super.setDefaultAssertionStatus(enabled)
    }

    override fun setPackageAssertionStatus(packageName: String?, enabled: Boolean) {
//        Log.e(tag, "setPackageAssertionStatus:$packageName  $enabled")
        super.setPackageAssertionStatus(packageName, enabled)
    }

    override fun setClassAssertionStatus(className: String?, enabled: Boolean) {
//        Log.e(tag, "setClassAssertionStatus:$className  $enabled")
        super.setClassAssertionStatus(className, enabled)
    }

    override fun clearAssertionStatus() {
//        Log.e(tag, "clearAssertionStatus:")
        super.clearAssertionStatus()
    }
}