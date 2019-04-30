package com.zero.demo.Demo4_21.Demo02;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("接口A默认方法");
    }
}
