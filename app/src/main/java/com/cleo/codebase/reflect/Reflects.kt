package com.cleo.codebase.reflect

/**
 * author:CliffLeopard
 * date:2023/3/1
 * time:16:18
 * email:precipiceleopard@gmail.com
 * link:
 */
class Reflects {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val c = A::class
            println(c)

            val a: A = B()
            println("a: ${a::class.qualifiedName}")

            val numbers = listOf(1, 2, 3)
            println(numbers.filter(isOdd))
            println(numbers.filter(isOdd1))
            println(numbers.filter(isOdd2))
            // 将具名函数isOdd3作为 函数类型 值，传递给filter,这时就需要 :: 操作符
            // 这里 ::isOdd3 是函数类型 (Int) -> Boolean 的一个值
            println(numbers.filter(::isOdd3))

        }

        fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
            return { x -> f(g(x)) }
        }
    }
}

// 匿名函数类型 值; 使用类扩展函数的形式声明
val isOdd = fun Int.(): Boolean = this % 2 != 0

// 匿名函数类型 值; 使用匿名函数
val isOdd1 = fun(number: Int): Boolean = number % 2 != 0

// lambda 表达式的形式
val isOdd2: (Int) -> Boolean = { it % 2 != 0 }

// 可作为具名函数类型 值; 本质上是使用反射； ::isOdd3的类型 是KFunction<out R> 的自类型之一。函数类型
fun isOdd3(x: Int) = x % 2 != 0




open class A {
    val aa = 10
}

class B : A() {
    val bb = 11
}

class C : A() {
    val cc = 12
}