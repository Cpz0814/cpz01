package com.cpz.Demo02;

public class DemoMath {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("===============");
        //向上取整
        System.out.println(Math.ceil(5.1));
        System.out.println(Math.ceil(5.9));
        System.out.println(Math.ceil(5.0));
        System.out.println("===============");
        //向下取整
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(3.0));
        System.out.println("===============");
        //四舍五入
        System.out.println(Math.round(3.2));
        System.out.println(Math.round(3.5));
        System.out.println(Math.round(3.0));
    }
}
