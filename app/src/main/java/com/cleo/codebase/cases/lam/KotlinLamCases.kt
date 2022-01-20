package com.cleo.codebase.cases.lam

import android.content.Context
import android.util.Log
import android.view.View

/**
 * author:gaoguanling
 * date:2022/1/20
 * time:13:28
 * email:gaoguanling@360.cn
 * link:
 */
class KotlinLamCases(context: Context) : LambdaCase(context) {
    private val message = "KotlinLamCases"
    override fun asmCreateFunction(view: View) {
    }

    override fun initAction() {
        case2()
    }

//    //1. 常用写法:Lambda表达式
//    private fun case1() {
//        this.setOnClickListener {
//            Log.e(LamConstant.tag, "Click Me case1")
//        }
//    }

    //2. 表达式指向函数:所在类非静态方法
    private fun case2() {
        this.setOnClickListener(this::target2)
    }


//    //3. 表达式指向函数:所在类@JvmStatic修饰的静态方法
//    private fun case3() {
//        this.setOnClickListener(KotlinLamCases::target3)
//    }
//
//    //4. 表达式指向函数:所在类无@JvmStatic修饰的静态方法
//    private fun case4() {
//        this.setOnClickListener(KotlinLamCases::target4)
//    }
//
//    //5. 表达式指向函数:非所在类非静态方法
//    private fun case5() {
//        val target = Target("Hello target5")
//        this.setOnClickListener(target::target5)
//    }
//
//    //6. 表达式指向函数:非所在类@JvmStatic修饰的静态方法
//    private fun case6() {
//        this.setOnClickListener(Target::target6)
//    }
//
//    //7. 表达式指向函数:非所在类无@JvmStatic修饰的静态方法
//    private fun case7() {
//        this.setOnClickListener(Target::target7)
//    }
//
//    //8. 表达式指向函数:非所在类且为Object类 @JvmStatic修饰的静态方法
//    private fun case8() {
//        this.setOnClickListener(TargetObject::target8)
//    }
//
//    //9. 表达式指向函数:非所在类且为Object类 无@JvmStatic修饰的静态方法
//    private fun case9() {
//        this.setOnClickListener(TargetObject::target9)
//    }
//
//    //10. 表达式指向函数:Java类的static方法.
//    private fun case10() {
//        this.setOnClickListener(TargetJava::target10)
//    }
//
//    //11. 使用函数表达式作为参数
//    private fun testCase11(func: (View) -> Unit) {
//        this.setOnClickListener(func)
//    }

    private fun target2(view: View) {
        Log.e(LamConstant.tag, "Click Me: target2 $message")
    }
//
//    companion object {
//        @JvmStatic
//        fun target3(view: View) {
//            Log.e(LamConstant.tag, "target3")
//        }
//
//        fun target4(view: View) {
//            Log.e(LamConstant.tag, "target4")
//        }
//    }

}