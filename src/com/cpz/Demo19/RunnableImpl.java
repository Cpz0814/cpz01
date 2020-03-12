package com.cpz.Demo19;

public class RunnableImpl implements Runnable {
    private int ticket=100;

    Object object=new Object();
    @Override
    public void run() {
        boolean dd=true;
        while (dd){
            synchronized (object) {
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
            if (ticket==0){
                System.out.println("票已经卖完了。。。");
                dd=false;
            }
        }
    }
}
