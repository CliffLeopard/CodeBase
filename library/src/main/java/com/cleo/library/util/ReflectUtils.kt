package com.cleo.library.util

import java.lang.reflect.Field
import java.lang.reflect.Method

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:14:38
 * email:gaoguanling@360.cn
 * link:
 */
object ReflectUtils {
    fun getField(clazz: Class<*>?, fieldName: String): Field {
        var originClass: Class<*>? = clazz
        while (originClass != null) {
            try {
                return originClass.getDeclaredField(fieldName)
            } catch (ignore: NoSuchFieldException) {
                originClass = originClass.superclass
            }
        }
        throw NoSuchFieldException()
    }

    fun getMethod(clazz: Class<*>?, methodName: String, vararg parameterTypes: Class<*>?): Method {
        var originClass: Class<*>? = clazz
        while (originClass != null) {
            try {
                return originClass.getDeclaredMethod(methodName, *parameterTypes)
            } catch (ignore: NoSuchMethodException) {
                originClass = originClass.superclass
            }
        }
        throw NoSuchMethodException()
    }
}