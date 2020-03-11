package com.cpz.Demo04;

import java.util.ArrayList;

public class Mymain {
    public static void main(String[] args) {
        Manger manger=new Manger("群主",1000);
        Member one= new Member("成员A",0);
        Member two= new Member("成员B",0);
        Member there= new Member("成员C",0);

        manger.show();
        one.show();
        two.show();
        there.show();
        System.out.println("========");
        ArrayList<Integer> redListt=manger.send(20,3);
        one.receive(redListt);
        two.receive(redListt);
        there.receive(redListt);

        manger.show();
        one.show();
        two.show();
        there.show();
    }
}
