package com.zero.demo.Demo4_20.Demo07;

public class Zi extends Fu {

    public Zi(){
        // super();
        System.out.println("子类构造方法执行");
    }
    @Override
    public void eat() {
        System.out.println("吃饭饭");
    }
}