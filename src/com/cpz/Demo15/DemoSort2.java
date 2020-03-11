package com.cpz.Demo15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoSort2 {
    public static void main(String[] args) {
        demo01();

        ArrayList<Person> ps= new ArrayList<>();
        ps.add(new Person("张三",25));
        ps.add(new Person("李四",20));
        ps.add(new Person("王五",21));
        System.out.println(ps);
        Collections.sort(ps, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int re=o1.getAge()-o2.getAge();
                if (re==0){
                    re = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return re;
            }
        });
        System.out.println(ps);
    }

    private static void demo01() {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(2);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(list);
    }
}
