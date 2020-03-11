package com.cpz.Demo14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        demo01();
        Person person=new Person();
        int i = person.hashCode();
        System.out.println(i);

        Person person2=new Person();
        int i2 = person2.hashCode();
        System.out.println(i2);
    }

    private static void demo01() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(1);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }
    }
}
