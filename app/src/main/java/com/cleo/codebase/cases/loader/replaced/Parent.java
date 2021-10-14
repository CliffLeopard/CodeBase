package com.cleo.codebase.cases.loader.replaced;

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:13:22
 * email:gaoguanling@360.cn
 * link:
 */
public class Parent {
    private static final String slogan = "Parent-ClassLoader:" + Parent.class.getClassLoader().toString();

    public static void print() {
        System.out.println(slogan);
    }

    public static String toStr() {
        return slogan;
    }
}
