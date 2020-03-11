package com.cpz.Demo16;

import java.util.HashMap;
import java.util.Scanner;

public class DemoMapTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for (char c:str.toCharArray()){
            if (map.containsKey(c)){
                Integer integer = map.get(c);
                integer++;
                map.put(c,integer);
            }else {
                map.put(c,1);
            }
        }
        for (Character key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }
}
