package com.cpz.Demo01;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        System.out.print("请输入的名字：");
        Scanner scanner=new Scanner(System.in);
        String ss = scanner.next();
        System.out.println("你好"+ss);
        System.out.print("请输入的第一个数字：");
        int it=scanner.nextInt();
        System.out.print("请输入的第二个数字：");
        int it2=scanner.nextInt();
        int it3=it+it2;
        System.out.println(ss+"计算的结果为"+it3);

        System.out.print("请输入的第一个数字：");
        int qh1=scanner.nextInt();
        System.out.print("请输入的第二个数字：");
        int qh2=scanner.nextInt();
        System.out.print("请输入的第三个数字：");
        int qh3=scanner.nextInt();
        /*int[] qhs={qh1,qh2,qh3};
        int max = qhs[0];
        for (int i=0;i<qhs.length;i++){
            if (max<qhs[i]){                //第一种方法
                max=qhs[i];
            }
        }
        System.out.println("最大的数为："+max);*/

        int temp=qh1 > qh2 ? qh1 : qh2;
        int max=temp > qh3 ? temp : qh3;           //第二种方法
        System.out.println("最大的数为："+max);
    }
}
