package com.cpz.Demo16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoEntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("李晨",180);
        map.put("范冰冰",165);
        map.put("李白",175);
        map.put("杜甫",175);
        Set<Map.Entry<String,Integer>> set=map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key+"="+value);
        }
    }
}
