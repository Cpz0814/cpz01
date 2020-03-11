package com.cpz.Demo18;

import java.util.Objects;

public class DemoThrow {
    public static void main(String[] args) {
        int[] jj={1,2,3,4};
        int e = getElement(jj, 3);
        System.out.println(e);

        method(null);
    }
    /*
throw关键字
 */
    public static int getElement(int[] arr,int index){
        if (arr==null){
            throw new NullPointerException("传递的数组数量是null");
        }
        if (index<0||index>arr.length-1) {
            throw new NullPointerException("数组索引越界");
        }
            int ele=arr[index];
            return ele;
    }
    public static void method(Object obj){
        Objects.requireNonNull(obj,"传递的对象值是null");
    }
}
