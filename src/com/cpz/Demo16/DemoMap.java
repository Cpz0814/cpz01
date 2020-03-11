package com.cpz.Demo16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        //put(key,value)key值不重复返回值是value；
        map.put("李晨",180);
        map.put("范冰冰",165);
        map.put("李白",175);
        map.put("杜甫",175);
        Integer in = map.get("李晨");//获取指定元素的value值
        System.out.println(in);
        boolean b = map.containsKey("李白");//判断集合中是否存在元素
        System.out.println(b);
        Integer remove = map.remove("杜甫");//删除指定元素
        System.out.println(remove);
        System.out.println(map);

        Set<String> set=map.keySet();
        Iterator<String> it = set.iterator();

        while (it.hasNext()){//迭代器遍历集合
            String next = it.next();
            Integer integer = map.get(next);
            System.out.println(next+"="+integer);
        }

        for (String s : set) {//增强for循环遍历集合
            Integer value = map.get(s);
            System.out.println(s+"="+value);
        }
    }
}
