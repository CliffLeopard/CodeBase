package com.cleo.codebase.cases.loader.replaced;

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:11:28
 * email:gaoguanling@360.cn
 * link:
 */
public class HelloWorld {
    private static final String loaderInfo = HelloWorld.class.getClassLoader().toString();

    public static void print() {
        System.out.println(loaderInfo);
    }

    public static String toStr() {
        return loaderInfo;
    }
}
