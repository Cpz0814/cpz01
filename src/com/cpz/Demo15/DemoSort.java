package com.cpz.Demo15;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class DemoSort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);//默认升序
        System.out.println(list);

        ArrayList<String> list1= new ArrayList<>();
        list1.add("a");
        list1.add("c");
        list1.add("e");
        list1.add("b");
        list1.add("d");
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        //自定义参数排序必须重写Comparable
        ArrayList<Person> ps= new ArrayList<>();
        ps.add(new Person("张三",25));
        ps.add(new Person("李四",20));
        ps.add(new Person("王五",21));
        System.out.println(ps);
        Collections.sort(ps);
        System.out.println(ps);
    }
}
