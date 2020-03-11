package com.cpz.Demo05;

public class MyMains {
    public static void main(String[] args) {
        MyAbsImpl abs=new MyAbsImpl();
        abs.methodAbs();
        abs.methodAbs2();
        DemoInterFace.methodAbs3();
        System.out.println(DemoInterFace.SUR);
    }
}
