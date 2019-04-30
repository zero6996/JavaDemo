package com.zero.demo.demo03_Class;

public class Phone {
    // 成员变量
    String brand; // 品牌
    float price; // 价格
    String color; // 颜色

    // 成员方法
    public void call(String who){
        System.out.println("给"+who+"打电话！");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }
    public void sendMessage(String name){
        System.out.println("给"+name+"发短信");
    }
}
