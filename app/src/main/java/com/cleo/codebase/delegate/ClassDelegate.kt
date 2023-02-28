package com.cleo.codebase.delegate

/**
 * author:CliffLeopard
 * date:2023/2/28
 * time:15:19
 * email:precipiceleopard@gmail.com
 * link:
 */

interface Base {
    fun print()
}

class BaseImp(private val x: Int) : Base {
    override fun print() {
        print(x)
    }
}

// 类委托: 调用一个类对象的方法，实际是通过调用另一个类对象的方来来实现的
class Derived(base: Base) : Base by base
class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val baseImp = BaseImp(10)
            Derived(baseImp).print()
        }
    }
}

