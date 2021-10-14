package com.cleo.codebase.cases.loader.replaced;

/**
 * author:gaoguanling
 * date:2021/10/12
 * time:13:22
 * email:gaoguanling@360.cn
 * link:
 */
public class Son {
    private static final String slogan = "Son-ClassLoader:" + Son.class.getClassLoader().toString();

    public static void print() {
        System.out.println(slogan);
    }

    public static String toStr() {
        return slogan;
    }
}
