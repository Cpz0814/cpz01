package com.cpz.Demo09;

public class StringBuders {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder);
        StringBuilder builder2 = new StringBuilder("abc");
        System.out.println(builder2);
        appenddemo();
        toStringdemo();
    }

    private static void toStringdemo() {
        System.out.println("toString方法↓");
        String ss="hello";
        System.out.println(ss);
        StringBuilder bu1 = new StringBuilder(ss);
        bu1.append("world");
        System.out.println("bu1:"+bu1);

    }

    private static void appenddemo() {
        System.out.println("append方法↓");
        StringBuilder bu1 = new StringBuilder();
        bu1.append("abc");
        bu1.append(25);
        bu1.append("陈");
        bu1.append(0.33);
        bu1.append(true);

        System.out.println("bu1："+bu1);
    }
}
