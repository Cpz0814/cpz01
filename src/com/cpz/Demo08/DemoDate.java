package com.cpz.Demo08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        Demo01();
        Demo02();
    }

    private static void Demo02() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse("2020-03-07 12:36:47");
            System.out.println("现在是："+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void Demo01() {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        String text = simpleDateFormat.format(date);
        System.out.println("现在是："+text);
    }
}
