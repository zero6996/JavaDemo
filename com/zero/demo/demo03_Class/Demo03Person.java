package com.zero.demo.demo03_Class;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "zero";
        person.setAge(-20);
        person.getAge();
        person.show();
    }
}
