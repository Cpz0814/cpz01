package com.cpz.Demo11;

import java.util.ArrayList;

/*
增强for循环
for(集合/数组的数据类型 变量名：集合名/数据名){
    sout（变量名）
}
 */
public class Demo_NBfor {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("田七");
        for (String s: list){
            System.out.println(s);
        }
    }
}
