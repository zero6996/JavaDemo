package com.zero.demo.demo03_Class;

public class Demo03PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "IphoneXR";
        one.price = 8388;
        one.color = "蓝色";

        method(one); // 传递进去的参数就是地址值
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
}
