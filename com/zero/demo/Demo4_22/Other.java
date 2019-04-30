package com.zero.demo.Demo4_22;
/*
如果出现了重名现象，使用格式：外部类名称.this.变量名

 */
public class Other {

    int num = 10; // 外部类的成员变量

    public class Inner{
        int num = 20; // 内部类的成员变量
        public void methodInner(){
            int num = 30; // 内部类方法的局部变量
            System.out.println(num); // 局部变量，就近原则
            System.out.println(this.num); // 内部类成员变量
            System.out.println(Other.this.num); // 外部类成员变量
        }
    }
}
