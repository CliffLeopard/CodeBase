package com.cleo.codebase.cases.lam
//
//import android.content.Context
//import android.util.Log
//import android.view.View
//import com.cleo.codebase.WrapperCenter
//
///**
// * author:gaoguanling
// * date:2022/1/20
// * time:14:08
// * email:gaoguanling@360.cn
// * link:
// */
//
//
//class HookedKotlinLamCases(context: Context) : LambdaCase(context) {
//    private val message = "KotlinLamCases"
//    override fun asmCreateFunction(view: View) {}
//    override fun initAction() {
//
//    }
//
//    //1. 常用写法:Lambda表达式
//    private fun case1() {
//        this.setOnClickListener {
//            Log.e(LamConstant.tag, "Click Me case1")
//        }
//    }
//
//    private fun happy1() {
//
//    }
//
//    //2. 表达式指向函数:所在类非静态方法
//    private fun case2() {
//        this.setOnClickListener(this::target2)
//    }
//
//    private fun happy2() {
//        this.setOnClickListener(this::gtCase2)
//    }
//
//
//    //3. 表达式指向函数:所在类@JvmStatic修饰的静态方法
//    private fun case3() {
//        this.setOnClickListener(HookedKotlinLamCases::target3)
//    }
//
//    private fun happy3() {
//        this.setOnClickListener(HookedKotlinLamCases::gtCase3)
//    }
//
//
//    //4. 表达式指向函数:所在类无@JvmStatic修饰的静态方法
//    private fun case4() {
//        this.setOnClickListener(HookedKotlinLamCases::target4)
//    }
//
//    private fun happy4() {
//        this.setOnClickListener(HookedKotlinLamCases::gtCase4)
//    }
//
//    //5. 表达式指向函数:非所在类非静态方法
//    private fun case5() {
//        val target = Target("Hello target5")
//        this.setOnClickListener(target::target5)
//    }
//
//    private fun happy5() {
//        val target = Target("Hello target5")
//        this.setOnClickListener(HookedKotlinLamCases.gtCase5(target))
//    }
//
//    //6. 表达式指向函数:非所在类@JvmStatic修饰的静态方法
//    private fun case6() {
//        this.setOnClickListener(Target::target6)
//    }
//
//    private fun happy6() {
//        val target = Target("Hello target5")
//        this.setOnClickListener(HookedKotlinLamCases::gtCase6)
//    }
//
//    //7. 表达式指向函数:非所在类无@JvmStatic修饰的静态方法
//    private fun case7() {
//        this.setOnClickListener(Target::target7)
//    }
//
//    private fun happy7() {
//        this.setOnClickListener(HookedKotlinLamCases::gtCase7)
//    }
//
//    //8. 表达式指向函数:非所在类且为Object类 @JvmStatic修饰的静态方法
//    private fun case8() {
//        this.setOnClickListener(TargetObject::target8)
//    }
//
//    private fun happy8() {
//        this.setOnClickListener(HookedKotlinLamCases::gtCase8)
//    }
//
//    //9. 表达式指向函数:非所在类且为Object类 无@JvmStatic修饰的静态方法
//    private fun case9() {
//        this.setOnClickListener(TargetObject::target9)
//    }
//
//    private fun happy9() {
//        this.setOnClickListener(HookedKotlinLamCases::gtCase9)
//    }
//
//    //10. 表达式指向函数:Java类的static方法.
//    private fun case10() {
//        this.setOnClickListener(TargetJava::target10)
//    }
//
//    private fun happy10() {
//        this.setOnClickListener(HookedKotlinLamCases::gtCase10)
//    }
//
//    //11. 使用函数表达式作为参数
//    private fun testCase11(func: (View) -> Unit) {
//        this.setOnClickListener(func)
//    }
//
//    private fun happy11(func: (View) -> Unit) {
//        this.setOnClickListener(HookedKotlinLamCases.gtCase11(func))
//    }
//
//    private fun target2(view: View) {
//        Log.e(LamConstant.tag, "Click Me: target2 $message")
//    }
//
//
//    // 应该ASM生成的方法
//    private fun gtCase2(view: View) {
//        WrapperCenter.wrapOnClickBefore(view)
//        target2(view)
//        WrapperCenter.wrapOnClickAfter(view)
//    }
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
//
//        // 下面是ASM应该生成的方法
//        @JvmStatic
//        fun gtCase3(view: View) {
//            WrapperCenter.wrapOnClickBefore(view)
//            target3(view)
//            WrapperCenter.wrapOnClickAfter(view)
//        }
//
//        @JvmStatic
//        fun gtCase4(view: View) {
//            WrapperCenter.wrapOnClickBefore(view)
//            target4(view)
//            WrapperCenter.wrapOnClickAfter(view)
//        }
//
//        @JvmStatic
//        fun gtCase5(target: Target): (View) -> Unit {
//            return {
//                WrapperCenter.wrapOnClickBefore(it)
//                target.target5(it)
//                WrapperCenter.wrapOnClickAfter(it)
//            }
//        }
//
//        @JvmStatic
//        fun gtCase6(view: View) {
//            WrapperCenter.wrapOnClickBefore(view)
//            Target.target6(view)
//            WrapperCenter.wrapOnClickAfter(view)
//        }
//
//        @JvmStatic
//        fun gtCase7(view: View) {
//            WrapperCenter.wrapOnClickBefore(view)
//            Target.target7(view)
//            WrapperCenter.wrapOnClickAfter(view)
//        }
//
//        @JvmStatic
//        fun gtCase8(view: View) {
//            WrapperCenter.wrapOnClickBefore(view)
//            TargetObject.target8(view)
//            WrapperCenter.wrapOnClickAfter(view)
//        }
//
//        @JvmStatic
//        fun gtCase9(view: View) {
//            WrapperCenter.wrapOnClickBefore(view)
//            TargetObject.target9(view)
//            WrapperCenter.wrapOnClickAfter(view)
//        }
//
//        @JvmStatic
//        fun gtCase10(view: View) {
//            WrapperCenter.wrapOnClickBefore(view)
//            TargetJava.target10(view)
//            WrapperCenter.wrapOnClickAfter(view)
//        }
//
//        @JvmStatic
//        fun gtCase11(func: (View) -> Unit): (View) -> Unit {
//            return {
//                WrapperCenter.wrapOnClickBefore(it)
//                func(it)
//                WrapperCenter.wrapOnClickAfter(it)
//            }
//        }
//
//    }
//}