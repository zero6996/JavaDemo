package com.zero.demo.Demo4_20.Demo08;

public class DogGolden extends Dog{
    @Override
    public void sleep() {
        System.out.println("呼呼呼。。。。");
    }
    @Override
    public void eat(){ // 重写了Dog父类的方法
        System.out.println("金毛吃骨头");
    }
}
