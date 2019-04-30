package com.zero.demo.demo03_Class;

public class Demo03Phone<psvm> {
    public static void main(String[] args){
        Phone ph = new Phone();
        System.out.println(ph.brand = "Iphone XR 128G");
        System.out.println(ph.price = 5600);
        System.out.println(ph.color = "蓝色");

        ph.call("乔布斯");
        ph.sendMessage();
        ph.sendMessage("小张");
    }
}
