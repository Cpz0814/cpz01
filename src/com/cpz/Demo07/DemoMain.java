package com.cpz.Demo07;

public class DemoMain {
    public static void main(String[] args) {
        MyinterImpl obj = new MyinterImpl() {
            @Override
            public void cpz() {
                System.out.println("鹏哥真帅");
            }
        };
        obj.cpz();
        System.out.println(10%3);
    }
}
