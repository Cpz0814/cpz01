package com.cpz.Demo16;

import java.util.HashMap;
import java.util.Set;

public class DemoPersonMap {
    public static void main(String[] args) {
        //存储自定义类型
        HashMap<String,Person> map = new HashMap<>();
        map.put("北京",new Person("李白",38));
        map.put("南京",new Person("苏轼",25));
        map.put("湖南",new Person("屈原",35));
        map.put("广东",new Person("张三",23));
        Set<String> set=map.keySet();
        for (String s : set) {
            Person person = map.get(s);
            System.out.println(s+"="+person);
        }
    }
}
