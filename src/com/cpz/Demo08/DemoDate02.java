package com.cpz.Demo08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoDate02 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的出生日期");
        String sr = sc.next();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        Date datesr = simpleDateFormat.parse(sr);
        long losr = datesr.getTime();
        long totime = new Date().getTime();
        long time=totime-losr;
        System.out.println(time/1000/60/60/24);
    }
}
