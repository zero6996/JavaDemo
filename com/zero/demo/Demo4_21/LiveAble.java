package com.zero.demo.Demo4_21;

/*
接口都能定义抽象方法
格式：
public abstract 返回值类型 方法名称(参数列表);

注意事项：
1. 接口当中的抽象方法，修饰符必须是两个固定的关键字：public abstract
2. 这两个关键字修饰符，可以选择性的省略。
3. 方法的三要素，可以随意定义。
 */
public interface LiveAble {
    // 定义抽象方法
    public abstract void eat();
    public abstract void sleep();
    public default void fly(){ // 定义默认方法
        fly3();
    }
    public default void fly2(){ // 定义默认方法
        fly3();
    }
    private static void fly3(){
        System.out.println("飞行");
    }
    public static void run(){
        System.out.println("这是静态方法，只能通过接口类调用");
    }
}
