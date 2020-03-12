package com.cpz.Demo19;

public class DemoRunnable {
    public static void main(String[] args) {
        MyRunnableImpl runnable=new MyRunnableImpl();
        Thread t=new Thread(new MyRunnableImpl2());
        Thread t2=new Thread(runnable);
        t.start();
        t2.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
        demo();
    }
    //匿名内部类
    private static void demo() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("匿名:"+i);
                }
            }
        }).start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("匿名2:"+i);
                }
            }
        }.start();

        Runnable r= new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("匿名3:"+i);
                }
            }
        };
        Thread thread=new Thread(r);
        thread.start();
    }
}
