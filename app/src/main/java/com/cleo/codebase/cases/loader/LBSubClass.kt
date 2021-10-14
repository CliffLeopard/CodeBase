package com.cleo.codebase.cases.loader

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.cleo.codebase.cases.ActionButton
import com.cleo.codebase.cases.loader.replaced.KtSon
import com.cleo.codebase.cases.loader.replaced.Parent
import com.cleo.codebase.cases.loader.replaced.Son

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:18:32
 * email:gaoguanling@360.cn
 * link:
 * 测试用例测试ShadowClassLoader的作用:
 * java class加载时，如果类存在 superClass,则在调用当前类的ClassLoader的loadClass方法去加载
 * 所以，当sonClass是通过CodeClassLoader加载的时候,loadClass只会去寻找逻辑parent classLoader和自身，不会再调用P系统自身的PathClassLoader
 * 因此使用ShadowClassLoader来作为影子ClassLoader来区别这种情况。 如果没有通过PathClassLoader加载，则在寻找完逻辑parent和自身之后继续使用PathClassLoader寻找。
 * 完全契合正常逻辑。
 * 这里Son类是通过CodeClassLoader加载的，而Parent类是通过PathClassLoader加载。都可以正常加载，并且都是使用正常的ClassLoader加载的。
 */
class LBSubClass(context: Context) : ActionButton(context) {
    @SuppressLint("ShowToast")
    override fun initAction() {
        this.setOnClickListener {
            Log.e(ClassLoaderActivity.tag, Parent.toStr())
            Log.e(ClassLoaderActivity.tag, Son.toStr())
            Log.e(ClassLoaderActivity.tag, KtSon.toStr())
            val ktSon = KtSon()
            Log.e(ClassLoaderActivity.tag, ktSon.showLoader())
        }
    }
}