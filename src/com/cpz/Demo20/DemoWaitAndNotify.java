package com.cpz.Demo20;

public class DemoWaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                synchronized (obj){
                    System.out.println("我要包子");
                    try {
                        obj.wait();//沉睡线程
                        //obj.wait(5000);//沉睡线程5秒钟
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("做好了，开吃");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("做好了");
                    obj.notify();//唤醒沉睡线程
                    //obj.notifyAll();//唤醒多个沉睡线程
                }
            }
        }.start();
    }
}
