package com.cleo.codebase.cases.lam;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import com.cleo.codebase.WrapperCenter;
import com.cleo.codebase.cases.ActionButton;

/**
 * author:gaoguanling
 * date:2021/10/5
 * time:14:29
 * email:gaoguanling@360.cn
 * link:
 */
class LambdaCase5 extends LambdaCase {
    public LambdaCase5(@NonNull Context context) {
        super(context);
    }

    @Override
    public void initAction() {
        staticInitAction(this);
    }

    public static void staticInitAction(View view) {
        view.setOnClickListener(view1 -> Log.e(LamConstant.tag, "Click Me:LambdaCase5"));
    }

    public static void staticInitAction2(View view) {
        view.setOnClickListener(LambdaCase5::lambdaStaticFuc);
    }

    private void case5OnClick(View view) {
        Log.e(LamConstant.tag, "Click Me:LambdaCase5");
    }

    @Override
    public void asmCreateFunction(@NonNull View view) {
        WrapperCenter.wrapOnClickBefore(view);
        lambdaStaticFuc(view);
        WrapperCenter.wrapOnClickAfter(view);
    }

    private static void lambdaStaticFuc(View view) {
        Log.e(LamConstant.tag, "Click Me:LambdaCase5");
    }
}
