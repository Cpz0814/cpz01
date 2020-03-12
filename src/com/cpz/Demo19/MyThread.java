package com.cpz.Demo19;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            System.out.println("run:"+i);
        }
        //获取线程名称
        String name1 = Thread.currentThread().getName();
        String name = getName();
        System.out.println(name+"="+name1);
    }
}
