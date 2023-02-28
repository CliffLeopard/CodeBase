package com.cleo.codebase.delegate

import kotlin.properties.Delegates

/**
 * author:CliffLeopard
 * date:2023/2/28
 * time:17:03
 * email:precipiceleopard@gmail.com
 * link:
 */
class ByMap {
    class Site(map: Map<String, Any?>) {
        val name: String? by map
        val age: Int? by map
        val url: String? by map
    }

    class Foo {
        var notNullBar: String by Delegates.notNull()
        var modifyVerify: String by Delegates.vetoable("") { property, old, new ->
            print("property: ${property.name} ${property.isConst} old:$old new:$new")
            true
        }
    }


    class Main {
        companion object {
            @JvmStatic
            fun main(args: Array<String>) {
                val site = Site(
                    mapOf(
                        "name" to "cliff-leopard",
                        "url" to "www.openai.com",
                        "age" to 10
                    )
                )
                println(site.name ?: "empty")
                println(site.url ?: "empty")
                println(site.age ?: "empty")


                val foo = Foo()
                foo.notNullBar = "bar"
                println(foo.notNullBar)
                foo.modifyVerify = "Hello"
            }
        }
    }
}