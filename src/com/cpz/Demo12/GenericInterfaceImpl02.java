package com.cpz.Demo12;

public class GenericInterfaceImpl02 implements GenericInterface02 {
    @Override
    public <E> void emm(E e) {
        System.out.println("接口泛型2："+e);
    }
}
