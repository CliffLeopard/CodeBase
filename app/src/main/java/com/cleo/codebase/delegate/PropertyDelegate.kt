package com.cleo.codebase.delegate

import kotlin.reflect.KProperty

/**
 * author:CliffLeopard
 * date:2023/2/28
 * time:15:27
 * email:precipiceleopard@gmail.com
 * link:
 */
class PropertyDelegate {

    open class Delegate {
        operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
            return "$thisRef,这里为多代理了 ${property.name} 属性"
        }

        operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            println("$thisRef 的 ${property.name} 属性赋值为 $value")
        }
    }

    class Example {
        var p: String by Delegate()

        // set get
        var z: String = ""
            set(value) {
                field = "${value}_"
            }
            get() {
                return "$field+"
            }

        // by lazy
        val m: String by lazy {
            "mmm" + "__" + "kkm"
        }
    }

    class Main {
        companion object {
            @JvmStatic
            fun main(args: Array<String>) {
                val e = Example()
                println(e.p)
                e.p = "设置值"
                println(e.p)
                println(e.m)
            }
        }
    }
}