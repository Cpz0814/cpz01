package com.cpz.chen01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<=100;i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        demo();
    }

    private static void demo() {
        ArrayList<String> ss = new ArrayList<>();
        ss.add("陈");
        ss.add("张");
        ss.add("李");
        ss.add("杜");
        ss.add("苏");
        for (int i = 0; i < ss.size(); i++) {
            String sd = ss.get(i);
            System.out.println(sd);
        }
    }

    public static void ddd(){
        System.out.println("6666666");
    }

}
