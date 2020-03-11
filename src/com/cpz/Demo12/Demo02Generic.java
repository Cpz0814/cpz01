package com.cpz.Demo12;

import com.cpz.Demo05.DemoInterFace;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02Generic {
    public static void main(String[] args) {
        Collection<Integer> list1=new ArrayList<>();
        Collection<String> list2=new ArrayList<>();
        Collection<Number> list3=new ArrayList<>();
        Collection<Object> list4=new ArrayList<>();

        Demo01(list1);
//        Demo01(list2);//报错,不是Number的子类
        Demo01(list3);
//        Demo01(list4);//报错,不是Number的子类，

//        Demo02(list1);//报错,不是Number的父类而是Number的子类
//        Demo02(list2);//报错,不是Number的父类
        Demo02(list3);
        Demo02(list4);
    }
    //泛型的上限：此时的泛型？，必须是Number类型或者Number的子类
    public static void Demo01(Collection<? extends Number> coll) {

    }
    //泛型的下限：此时的泛型？，必须是Number类型或者Number的父类
    private static void Demo02(Collection<? super Number> coll) {
    }
}
