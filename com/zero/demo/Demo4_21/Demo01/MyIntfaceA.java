package com.zero.demo.Demo4_21.Demo01;

public interface MyIntfaceA {
    public abstract void methodA();
    public abstract void methodAbs();
    public default void methodDefault(){
        System.out.println("默认方法A");
    }
}
