package com.cpz.Demo01;

import java.util.Random;
import java.util.Scanner;

public class DemoRandom {
    public static void main(String[] args) {
        Random r = new Random();
        int i= r.nextInt(100)+1;
        Scanner scanner=new Scanner(System.in);

        for (int i1=0;i1<10;i1++){
            System.out.print("请输入数字：");
            int ss = scanner.nextInt();
            if (ss==i){
                System.out.println("正确"+i);
                break;
            }else if (ss>i){
                System.out.println("数字大了");
            }else if (ss<i){
                System.out.println("数字小了");
            }
        }
    }
}
