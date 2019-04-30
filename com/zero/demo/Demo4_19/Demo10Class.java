package com.zero.demo.Demo4_19;

public class Demo10Class {
    public static void main(String[] args) {
        Student stu = new Student("法师",11);
        stu.room = "101号教室";
        System.out.println("姓名："+stu.getName()+",年龄:"+stu.getAge()+"岁,教室："+stu.getRoom()+",学号："+stu.getSid());
        Student stu2 = new Student("盗贼",15);
        System.out.println("姓名："+stu2.getName()+",年龄:"+stu2.getAge()+"岁,教室："+stu2.getRoom()+",学号："+stu2.getSid());
    }
}
