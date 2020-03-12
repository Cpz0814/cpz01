package com.cpz.Demo19;

import java.io.IOException;
import java.nio.CharBuffer;

public class DemoThread {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.setName("李白");
        mt.start();
        MyThread mt2=new MyThread();
        mt2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main:"+i);
        }
    }
}
