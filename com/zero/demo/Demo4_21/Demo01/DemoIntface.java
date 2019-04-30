package com.zero.demo.Demo4_21.Demo01;

/*
使用接口的时候，需注意：
1. 接口是没有静态代码块或者构造方法的。
2. 一个类的直接父类是唯一的，但是一个类可以同时实现多个接口的。
格式：
public class MyIntfaceImpl implements MyInterfaceA,MyInterfaceB{
    // 覆盖重写所有抽象方法
}
3. 如果实现类实现的多个接口中，存在重复的抽象方法，只需覆盖重写一次即可。
4. 如果实现类没有覆盖重写所以接口的所有抽象方法，那么实现类必须是抽象类。
5. 如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
6. 一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先用父类当中的方法。
 */

public class DemoIntface {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface();
        myInterface.methodDefault();
        Zi zi = new Zi();
        zi.method();
    }
}
