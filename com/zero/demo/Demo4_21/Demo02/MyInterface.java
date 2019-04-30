package com.zero.demo.Demo4_21.Demo02;
/*
这个子接口当中有几个方法？答：4个。
methodA 来源于接口A
methodB 来源于接口B
methodCommon 同时来源于接口A,B
method 来源于自己


 */

public interface MyInterface extends MyInterfaceA,MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() { // 重写父接口的默认方法

    }
}
