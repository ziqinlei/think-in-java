package com.ziqinlei.util;

import java.io.PrintStream;

/**
 * @author ziqin.lei
 * @since 2018/7/22
 */
public class Print {
    public static void print(Object object) {
        System.out.println(object);
    }

    public static void print() {
        System.out.println();
    }

    public static void printnb(Object object) {
        System.out.print(object);
    }

    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
}
