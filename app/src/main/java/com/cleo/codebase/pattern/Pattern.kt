package com.cleo.codebase.pattern

/**
 * author:CliffLeopard
 * date:2023/3/1
 * time:11:22
 * email:precipiceleopard@gmail.com
 * link:
 */
class Pattern {
    /**
     * Java
     * 使用处型变
     * 1. 协变： traverse(List<? extends T> list)  作为生产者， 只能读取数据 (列表中的元素为T或其子类)
     * 2. 逆变：      add(List<? super   T>  list) 作为消费者， 只能添加数据  (列表中的元素为T或其父类族)
     *
     * Kotlin
     * 声明处型变
     * 1.   out 型变注解，协变效果
     * 2.   in  型变注解，逆变效果
     *
     * 使用处型变：类型投影
     *
     *
     */

    class A(val p: Int)

    class Main {
        companion object {
            @JvmStatic
            fun main(args: Array<String>) {
                val repeatFun: String.(Int) -> String = { times -> this.repeat(times) }
                val twoParameters: (String, Int) -> String = repeatFun // OK

                fun runTransformation(f: (String, Int) -> String): String {
                    return f("hello", 3)
                }

                println("mm".repeatFun2(1))
                val result = runTransformation(String::substring) // OK
                println(result)

                var sum0 = 0
                setOf(1, 2, 4)
                    .filter { it > 0 }
                    .forEach { sum0 += it }
                print(sum0)

                val sum: Int.(Int) -> Int = { other -> this.plus(other) }
                val sum2 = fun Int.(other: Int): Int = this + other
            }


        }
    }
}

fun String.repeatFun2(number: Int): String {
    return "$this kkk$number"
}