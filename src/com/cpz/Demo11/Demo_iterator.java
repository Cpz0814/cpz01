package com.cpz.Demo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
iterator迭代器（对集合进行遍历）
 */
public class Demo_iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        Iterator<String> iterator = coll.iterator();
        /*boolean b = iterator.hasNext();//判断还有没有下一个元素
        System.out.println(b);

        String next = iterator.next();//取出集合中下一个元素
        System.out.println(next);*/

        while (iterator.hasNext()){//循环取出元素
            String next1 = iterator.next();
            System.out.println(next1);
        }


    }
}
