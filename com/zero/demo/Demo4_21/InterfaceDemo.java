package com.zero.demo.Demo4_21;
/*
接口使用步骤：
1. 接口不能直接使用
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        // 创建子类对象
        Animal a = new Animal();
        a.eat();
        a.sleep();
        a.fly(); // 如果实现类没有重写默认方法，则执行的是继承自接口类的默认方法，重写则执行实现类重写后的方法
// a.run(); 报错，无法通过实现类调用静态方法
        LiveAble.run(); // 接口类的静态方法只能通过接口类来调用
                }
                }
