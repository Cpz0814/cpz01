package com.cpz.Demo12;

public class GenericInterfaceImpl<E> implements GenericInterface<E> {

    @Override
    public void tenm(E e) {
        System.out.println("接口泛型："+e);
    }
}
