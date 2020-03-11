package com.cpz.Demo03;

public class Zi extends DemoExtents {
    String sss="李白的儿子";
    public void zzs(){
        String sss="小李白";
        System.out.println(sss);//局部变量
        System.out.println(this.sss);//本类变量
        System.out.println(super.sss);//父类变量
    }
    @Override
    public void de(){
        System.out.println("重写");
    }
}
