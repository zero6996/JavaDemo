package com.zero.demo.Demo4_21.Demo02;

public interface MyInterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("接口B默认方法");
    }
}
