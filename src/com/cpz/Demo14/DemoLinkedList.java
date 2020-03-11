package com.cpz.Demo14;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.addFirst("d");//将元素添加到集合的开头
        System.out.println(list);
    }
}
