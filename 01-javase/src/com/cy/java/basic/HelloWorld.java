package com.cy.java.basic;
//检查类加载可借助JVM参数: -XX:+TraceClassLoading
public class HelloWorld {
    public static void main(String[] args) {//args 用于接收运行时传入的参数
        System.out.println("HelloWorld");
        System.out.println(args[0]);//加入运行时没有传入参数会出现数组下标越界
        System.out.println(args[1]);
    }
}
