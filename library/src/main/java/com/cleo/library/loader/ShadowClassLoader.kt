package com.cleo.library.loader

import dalvik.system.PathClassLoader
import java.net.URL
import java.util.*

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:15:21
 * email:gaoguanling@360.cn
 * link:
 *
 */
class ShadowClassLoader(private val theParent: CodeClassLoader) : PathClassLoader("", theParent) {
    override fun loadClass(name: String?, resolve: Boolean): Class<*>? {
        return theParent.loadClassFromChildClassLoader(name, resolve)
    }

    override fun getResource(name: String?): URL? {
        return theParent.getResourceFromChildClassLoader(name)
    }

    override fun getResources(name: String?): Enumeration<URL> {
        return theParent.getResourcesFromChildClassLoader(name)
    }
}