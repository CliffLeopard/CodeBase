package com.cleo.codebase.cases.lam;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * author:gaoguanling
 * date:2022/1/20
 * time:19:44
 * email:gaoguanling@360.cn
 * link:
 */
public abstract class JavaLamCases extends LambdaCase {
    public JavaLamCases(@NonNull Context context) {
        super(context);
    }

    @Override
    public void asmCreateFunction(@NonNull View view) {

    }

    //1. 常用写法:Lambda表达式
    void case1() {
        this.setOnClickListener(view -> Log.e(LamConstant.tag, "Click Me case1"));
    }

    //2. 表达式指向函数:所在类非静态方法
    void case2() {
        this.setOnClickListener(this::target2);
    }

    //3. 表达式指向函数:Kotlin类@JvmStatic修饰静态方法
    void case3() {
        this.setOnClickListener(KotlinLamCases::target3);
    }

    //4. 表达式指向函数:Kotlin类无@JvmStatic修饰的静态方法
    void case4() {
        this.setOnClickListener(KotlinLamCases.Companion::target4);
    }

    //5. 表达式指向函数:Kotlin类非静态方法
    void case5() {
        Target target = new Target("Hello target5");
        this.setOnClickListener(target::target5);
    }

    //6. 表达式指向函数:所在类静态方法
    void case6() {
        this.setOnClickListener(JavaLamCases::target6);
    }

    //10. 表达式指向函数:非所在类,Java类的static方法.
    void case10() {
        this.setOnClickListener(TargetJava::target10);
    }

    private void target2(View view) {
        Log.e(LamConstant.tag, "Click Me: target2 $message");
    }

    public static void target6(View view) {
        Log.e(LamConstant.tag, "target6");
    }

    public static List<JavaLamCases> getAll(Context context) {
        List<JavaLamCases> all = new ArrayList<>();
        all.add(new JavaLamCases(context) {
            @Override
            public void initAction() {
                this.case1();
            }

            @NonNull
            @Override
            public String getTittle() {
                return "Java:Lambda表达式";
            }
        });
        all.add(new JavaLamCases(context) {
            @Override
            public void initAction() {
                this.case2();
            }

            @NonNull
            @Override
            public String getTittle() {
                return "Java:所在类非静态方法";
            }
        });
        all.add(new JavaLamCases(context) {
            @Override
            public void initAction() {
                this.case3();
            }

            @NonNull
            @Override
            public String getTittle() {
                return "Java:Kotlin类@JvmStatic静态方法";
            }
        });
        all.add(new JavaLamCases(context) {
            @Override
            public void initAction() {
                this.case4();
            }

            @NonNull
            @Override
            public String getTittle() {
                return "Java:Kotlin类非@JvmStatic静态方法";
            }
        });
        all.add(new JavaLamCases(context) {
            @Override
            public void initAction() {
                this.case5();
            }

            @NonNull
            @Override
            public String getTittle() {
                return "Java:Kotlin类非静态方法";
            }
        });
        all.add(new JavaLamCases(context) {
            @Override
            public void initAction() {
                this.case6();
            }

            @NonNull
            @Override
            public String getTittle() {
                return "Java:Java所在类静态方法";
            }
        });
        all.add(new JavaLamCases(context) {
            @Override
            public void initAction() {
                this.case10();
            }

            @NonNull
            @Override
            public String getTittle() {
                return "Java:非本类Java类的static方法";
            }
        });
        return all;
    }
}
