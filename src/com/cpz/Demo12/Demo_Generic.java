package com.cpz.Demo12;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo_Generic {
    public static void main(String[] args) {
        show();
        show2();
        System.out.println("=========");
        Generic_Method gm=new Generic_Method();
        gm.meth01("李白");
        gm.meth01(20);
        System.out.println("=========");

        GenericInterfaceImpl<String> gi=new GenericInterfaceImpl<>();
        gi.tenm("kk");
        gi.tenm("20");
        System.out.println("=========");

        GenericInterfaceImpl02 gi2=new GenericInterfaceImpl02();
        gi2.emm("jj");
        gi2.emm(20);

    }

    private static void show2() {
        //不使用泛型
        GenericClass gc= new GenericClass();
        gc.setName("张三");
        gc.setAge(20);
        System.out.println("我叫:"+gc.getName()+",年龄:"+gc.getAge());
        System.out.println("=====================");
        //使用泛型
        GenericClass<String> gcs= new GenericClass<>();
        gcs.setName("李四");
        gcs.setAge("22");
        System.out.println("我叫:"+gc.getName()+",年龄:"+gc.getAge());
    }

    private static void show() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(123);
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
