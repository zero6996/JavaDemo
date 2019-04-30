package com.zero.demo.Demo4_21.Demo01;

public interface MyIntfaceB {
    public abstract void methodB();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法B");
    }
}
