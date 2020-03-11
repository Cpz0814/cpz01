package com.cpz.Demo08;

import java.util.Calendar;

public class DemoDate03 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month+1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }
}
