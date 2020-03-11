package com.cpz.Demo17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class DemoDouDIZhu02 {
    public static void main(String[] args) {
        HashMap<Integer,String> poker=new HashMap<>();
        ArrayList<Integer> pokerIndex=new ArrayList<>();
        List<String> colors=new ArrayList<>();
        List<String> number=new ArrayList<>();
        Collections.addAll(colors,"♠","♣","♥","♦");
        Collections.addAll(number,"2","A","K","Q","J","10","9","8","7","6","5","4","3");
//        System.out.println(colors);
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        for (String s : number) {
            for (String color : colors) {
                poker.put(index,color+s);
                pokerIndex.add(index);
                index++;
            }
        }
        Collections.shuffle(pokerIndex);
//        Collections.shuffle(pokerIndex);
        ArrayList<Integer> player01=new ArrayList<>();
        ArrayList<Integer> player02=new ArrayList<>();
        ArrayList<Integer> player03=new ArrayList<>();
        ArrayList<Integer> dipai=new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            if (i>=51){
                dipai.add(in);
            }else if (i%3==0){
                player01.add(in);
            }else if (i%3==1){
                player02.add(in);
            }else if (i%3==2){
                player03.add(in);
            }
        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);

        lokkPoker("李白",poker,player01);
        lokkPoker("杜甫",poker,player02);
        lokkPoker("苏轼",poker,player03);
        lokkPoker("底牌",poker,dipai);
    }
    public static void lokkPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name+":");
        for (Integer key : list) {
            String value=poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
