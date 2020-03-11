package com.cpz.Demo05;
/*
接口
 */
public interface DemoInterFace {
    public static final String SUR = "李白";

    public abstract void methodAbs();
    public default void methodAbs2(){
        System.out.println("默认方法");
    }
    public static void methodAbs3(){
        System.out.println("静态方法");
    }
}
