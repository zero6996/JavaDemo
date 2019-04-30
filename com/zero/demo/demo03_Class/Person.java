package com.zero.demo.demo03_Class;

public class Person {
    String name;
    private int age;

    public void show(){
        System.out.println("I am "+ name + ",age is " + age);
    }
    public void setAge(int num){
        if(num < 1){
            System.out.println("年龄不能小于0");
            return ;
        }
        age = num;
    }
    public int getAge(){
        return age;
    }
}
