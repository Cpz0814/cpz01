package com.cpz.Demo19.mysy;

public class RunnableImpl1 implements Runnable {
    private static int ticket=100;

    Object object=new Object();
    @Override
    public void run() {
        boolean dd=true;
        while (dd){
            mysynchronized();
            if (ticket==0){
                System.out.println("票已经卖完了。。。");
                dd=false;
            }
        }
    }

    private synchronized void mysynchronized() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
    private static /*synchronized*/ void mysynchronizeds() {
        synchronized (RunnableImpl1.class) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
