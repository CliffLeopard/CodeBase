package com.cleo.codebase.delegate

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy

/**
 * author:CliffLeopard
 * date:2023/2/28
 * time:15:41
 * email:precipiceleopard@gmail.com
 * link:
 */
class DynamicDelegate {
    // 接口
    interface IRentHouse {
        fun visitHouse()
        fun signContract()
    }

    // 被代理对象
    class HouseOwner : IRentHouse {
        override fun visitHouse() {
            println("HouseOwner 带领看房，介绍房屋特点")
        }

        override fun signContract() {
            println("HouseOwner 签合同")
        }
    }

    // InvocationHandler
    class AgentHandler(private val mTarget: Any?) : InvocationHandler {
        override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
            println("方法执行前")
            val result = method?.invoke(mTarget, *args.orEmpty())
            println("方法执行后")
            return result
        }
    }

    // 动态代理实体
    class HouseAgentSmart(houseOwner: IRentHouse) : IRentHouse by Proxy.newProxyInstance(
        houseOwner.javaClass.classLoader, arrayOf(IRentHouse::class.java), AgentHandler(houseOwner)
    ) as IRentHouse

    class Main {
        companion object {
            @JvmStatic
            fun main(args: Array<String>) {
                val houseOwner = HouseOwner()
                val smartAgent = HouseAgentSmart(houseOwner)
                smartAgent.visitHouse()
                smartAgent.signContract()
            }
        }
    }
}