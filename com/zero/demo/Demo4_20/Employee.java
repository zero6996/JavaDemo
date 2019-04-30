package com.zero.demo.Demo4_20;

public class Employee {
    String name;
    public void work(){
        System.out.println("努力工作");
    }
}

class Teacher extends Employee{
    public void printName(){
        System.out.println("name:" + name);
    }
}