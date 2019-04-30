package com.zero.demo.demo03_Class;

public class Demo03Student {
    public static void main(String[] args){
        Student stu = new Student("小米",15);
        Student stu1 = new Student();
        System.out.println(stu.name+stu.age);
    }
}
