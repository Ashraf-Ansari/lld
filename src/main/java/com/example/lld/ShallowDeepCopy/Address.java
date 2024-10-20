package com.example.lld.ShallowDeepCopy;

public class Address implements Cloneable{
    int a = 23;
    Integer b = 24;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
