package com.cpz.Demo19;

public class MyRunnableImpl2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Hello"+"-->"+i);
        }
    }
}
