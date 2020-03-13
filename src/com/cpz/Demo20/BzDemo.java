package com.cpz.Demo20;

public class BzDemo {
    public static void main(String[] args) {
        BaoZi baoZi=new BaoZi();
        new BaoZiPu(baoZi).start();
        new ChiHuo(baoZi).start();
    }
}
