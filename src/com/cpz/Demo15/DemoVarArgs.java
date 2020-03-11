package com.cpz.Demo15;

import java.util.ArrayList;
import java.util.Collections;

public class DemoVarArgs {
    public static void main(String[] args) {
        add("结果",20,50,80);
        ArrayList<String> list=new ArrayList<>();
        Collections.addAll(list,"a","s","d","f");//往集合中添加一些元素。
        System.out.println(list);

        Collections.shuffle(list);//打乱集合顺序
        System.out.println(list);
    }


    /*可变参数
    不可定义多个可变参数
    可变参数必须写在参数列表的末尾。*/
    private static int add(String s,int...arr) {
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
        System.out.println(s+":"+sum);
        return sum;
    }
}
