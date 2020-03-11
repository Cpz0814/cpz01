package com.cpz.Demo17;

public class DemoDebug {
    /*
    f8:逐行执行程序
    f7:进入到方法中
    shift+f8:跳出方法
    f9:跳到下一个断点，如果没有下一个断点就结束程序
    ctrl+f2:退出debug模式，停止程序
    Console：切换到控制台
     */
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int mun=a+b;
        System.out.println(mun);
    }
}
