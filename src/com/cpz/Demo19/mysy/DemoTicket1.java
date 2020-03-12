package com.cpz.Demo19.mysy;

public class DemoTicket1 {
    public static void main(String[] args) {
        RunnableImpl1 run=new RunnableImpl1();
        Thread thread1=new Thread(run);
        Thread thread2=new Thread(run);
        Thread thread3=new Thread(run);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
