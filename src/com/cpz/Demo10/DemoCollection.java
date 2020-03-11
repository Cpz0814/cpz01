package com.cpz.Demo10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class DemoCollection {
    public static void main(String[] args) {
//        Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

        coll.remove("张三");//删除
        System.out.println(coll);

        boolean dd = coll.contains("李四");//判断是否包含
        System.out.println(dd);

        boolean empty = coll.isEmpty();//判断集合是否为空
        System.out.println(empty);

        int size = coll.size();//返回集合的个数
        System.out.println(size);

        Object[] arr = coll.toArray();//吧集合中的元素储存到数组中
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        coll.clear();//清空集合中所有元素
        System.out.println(coll);
    }
}
