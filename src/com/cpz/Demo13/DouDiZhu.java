package com.cpz.Demo13;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> pokei = new ArrayList<>();
        pokei.add("大王");
        pokei.add("小王");
        String[] colos = {"♠","♣","♥","♦"};
        String[] number = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (String s : number) {
            for (String colo : colos) {
                pokei.add(colo+s);
            }
        }

        Collections.shuffle(pokei);//打乱集合顺序

        ArrayList<String> play01=new ArrayList<>();
        ArrayList<String> play02=new ArrayList<>();
        ArrayList<String> play03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        for (int i = 0; i < pokei.size(); i++) {
            String p = pokei.get(i);
            if (i>=51){
                dipai.add(p);
            }else if (i%3==0){
                play01.add(p);
            }else if (i%3==1){
                play02.add(p);
            }else if (i%3==2){
                play03.add(p);
            }
        }
        System.out.println("李白的："+play01);
        System.out.println("杜甫的："+play02);
        System.out.println("苏轼的："+play03);
        System.out.println("底牌："+dipai);

    }
}
