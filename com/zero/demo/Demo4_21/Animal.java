package com.zero.demo.Demo4_21;



// 接口实现类
public class Animal implements LiveAble{
    @Override
    public void eat(){ // 重写接口中的抽象方法
        System.out.println("吃东西");
    }
    @Override
    public void sleep(){
        System.out.println("睡觉");
    }

    @Override
    public void fly(){ // 重写接口中的默认方法，也可以不重写，继承接口类中的默认方法
        System.out.println("自由自在的飞！");
    }
}
