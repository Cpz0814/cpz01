package com.cpz.Demo19.mysy2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl2 implements Runnable {
    private static int ticket=100;
    Lock l=new ReentrantLock();//创建锁对象
    @Override
    public void run() {
        boolean dd = true;
        while (dd) {
            l.lock();//获取锁
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
                if (ticket == 0) {
                    System.out.println("票已经卖完了。。。");
                    dd = false;
                }
            }
            l.unlock();//释放锁
        }
    }
}
