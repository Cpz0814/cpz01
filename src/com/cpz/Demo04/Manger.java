package com.cpz.Demo04;

import java.util.ArrayList;

public class Manger extends User {
    public Manger() {
    }

    public Manger(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totaMoney,int count){
        ArrayList<Integer> redList=new ArrayList<>();
        int leftMoney = super.getMoney();
        if (totaMoney>leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(leftMoney-totaMoney);
        int avg =totaMoney/count;
        int mod=totaMoney%count;
        for (int i = 0; i < count-1; i++) {
            redList.add(avg);
        }
        int last=avg+mod;
        redList.add(last);
        return redList;
    }
}
