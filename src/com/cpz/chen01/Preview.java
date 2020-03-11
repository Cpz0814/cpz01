package com.cpz.chen01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Preview {
    public static void main(String[] args) {
        Main.ddd();

        for (int i = 0; i < 5; i++) {
            for (int i1 = 0; i1 < 10; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
        String l="李白";
        String k="杜甫";
        String mxs=l.equals(k)?"是":"不";
        System.out.println(mxs);
        System.out.println(getYYYY());
    }
    public static String getYYYY(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
}
