package com.cpz.Demo19.mysy2;

public class DemoTicket2 {
    public static void main(String[] args) {
        RunnableImpl2 run=new RunnableImpl2();
        Thread thread1=new Thread(run);
        Thread thread2=new Thread(run);
        Thread thread3=new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
