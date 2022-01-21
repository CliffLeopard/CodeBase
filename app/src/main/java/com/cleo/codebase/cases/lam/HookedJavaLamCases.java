package com.cleo.codebase.cases.lam;
//
//import android.content.Context;
//import android.util.Log;
//import android.view.View;
//
//import com.cleo.codebase.WrapperCenter;
//
///**
// * author:gaoguanling
// * date:2022/1/20
// * time:19:59
// * email:gaoguanling@360.cn
// * link:
// */
//class HookedJavaLamCases extends LambdaCase {
//    public HookedJavaLamCases(Context context) {
//        super(context);
//    }
//
//    @Override
//    public void initAction() {
//
//    }
//
//    @Override
//    public void asmCreateFunction(View view) {
//
//    }
//
//    //1. 常用写法:Lambda表达式
//    private void case1() {
//        this.setOnClickListener(view -> Log.e(LamConstant.tag, "Click Me case1"));
//    }
//
//    private void happy1() {
//
//    }
//
//    //2. 表达式指向函数:所在类非静态方法
//    private void case2() {
//        this.setOnClickListener(this::target2);
//    }
//
//    private void happy2() {
//        this.setOnClickListener(this::gtCase2);
//    }
//
//    //3. 表达式指向函数:Kotlin类@JvmStatic修饰静态方法
//    private void case3() {
//        this.setOnClickListener(KotlinLamCases::target3);
//    }
//
//    private void happy3() {
//        this.setOnClickListener(HookedJavaLamCases::gtCase3);
//    }
//
//    //4. 表达式指向函数:Kotlin类无@JvmStatic修饰的静态方法
//    private void case4() {
//        this.setOnClickListener(KotlinLamCases.Companion::target4);
//    }
//
//    private void happy4() {
//        this.setOnClickListener(HookedJavaLamCases::gtCase4);
//    }
//
//    //5. 表达式指向函数:Kotlin类非静态方法
//    private void case5() {
//        Target target = new Target("Hello target5");
//        this.setOnClickListener(target::target5);
//    }
//
//    private void happy5() {
//        Target target = new Target("Hello target5");
//        this.setOnClickListener(HookedJavaLamCases.gtCase5(target));
//    }
//
//    private void happy52(){
//        Target target = new Target("Hello target5");
//        this.setOnClickListener(view -> {
//            WrapperCenter.wrapOnClickBefore(view);
//            target.target5(view);
//            WrapperCenter.wrapOnClickAfter(view);
//        });
//    }
//
//    //6. 表达式指向函数:所在类静态方法
//    private void case6() {
//        this.setOnClickListener(HookedJavaLamCases::target6);
//    }
//
//    private void happy6() {
//        this.setOnClickListener(HookedJavaLamCases::gtCase6);
//    }
//
//    //10. 表达式指向函数:非所在类,Java类的static方法.
//    private void case10() {
//        this.setOnClickListener(TargetJava::target10);
//    }
//
//    private void happy10() {
//        this.setOnClickListener(HookedJavaLamCases::gtCase10);
//    }
//
//
//    private void target2(View view) {
//        Log.e(LamConstant.tag, "Click Me: target2 $message");
//    }
//
//
//    // ASM 自动生成的函数
//    private void gtCase2(View view) {
//        WrapperCenter.wrapOnClickBefore(view);
//        target2(view);
//        WrapperCenter.wrapOnClickAfter(view);
//    }
//
//
//    public static void target6(View view) {
//        Log.e(LamConstant.tag, "target6");
//    }
//
//    // ASM 自动生成的静态方法
//    public static void gtCase3(View view) {
//        WrapperCenter.wrapOnClickBefore(view);
//        KotlinLamCases.target3(view);
//        WrapperCenter.wrapOnClickAfter(view);
//    }
//
//    public static void gtCase4(View view) {
//        WrapperCenter.wrapOnClickBefore(view);
//        KotlinLamCases.Companion.target4(view);
//        WrapperCenter.wrapOnClickAfter(view);
//    }
//
//    public static OnClickListener gtCase5(Target target) {
//        return view -> {
//            WrapperCenter.wrapOnClickBefore(view);
//            target.target5(view);
//            WrapperCenter.wrapOnClickAfter(view);
//        };
//    }
//
//    public static void gtCase6(View view) {
//        WrapperCenter.wrapOnClickBefore(view);
//        HookedJavaLamCases.target6(view);
//        WrapperCenter.wrapOnClickAfter(view);
//    }
//
//    public static void gtCase10(View view) {
//        WrapperCenter.wrapOnClickBefore(view);
//        TargetJava.target10(view);
//        WrapperCenter.wrapOnClickAfter(view);
//    }
//
//}
