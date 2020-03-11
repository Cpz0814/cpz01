package com.cpz.Demo12;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        list01.add("李白");
        list01.add("杜甫");

        ArrayList<Integer> list02=new ArrayList<>();
        list02.add(20);
        list02.add(25);
        Demos(list01);
        Demos(list02);
    }
    //符号？为通配符
    private static void Demos(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }


}
