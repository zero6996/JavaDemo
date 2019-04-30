package com.zero.demo.Demo4_22;

/*

分类：
1. 成员内部类
2. 局部内部类(包含匿名内部类)

如何使用成员内部类？两种方式：
1. 间接方式：在外部类的方法中，使用内部类；然后通过调用外部类方法来间接调用内部类。
2. 直接方式：[外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();]
 */
public class InnerClassDemo02 {
    public static void main(String[] args) {
        Body body = new Body();
        body.methodBody(); // 间接通过外部类方法访问内部类
        System.out.println("下面使用直接访问方式访问内部类");
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
