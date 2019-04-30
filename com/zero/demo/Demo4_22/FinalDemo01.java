package com.zero.demo.Demo4_22;

public class FinalDemo01 {
    public static void main(String[] args) {
        // 1. 以下示意局部变量基本类型使用final关键字修饰。
        final int a; // 使用final修饰，声明变量。
        a = 10; // 第一次赋值，编译通过
//        a = 20; // 第二次赋值，报错。
        final int b = 10; // 申明变量同时直接赋值，使用final修饰
//        b = 20; // 报错,不可重新赋值

        for(int i = 0; i < 10;i++){
            final int c = i;
            System.out.print(c);
        }

        // 2. 以下示例局部变量引用类型使用final关键字修饰。
        final TestFinal tf = new TestFinal("张三",11); // 创建一个测试对象。
//        tf = new TestFinal(); // 新创建一个对象，把tf指向该对象。报错，使用final修饰后无法改变地址值。

    }
}
