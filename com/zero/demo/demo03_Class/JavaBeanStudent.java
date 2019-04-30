package com.zero.demo.demo03_Class;

public class JavaBeanStudent {
    private String name;
    private  int age;

    public JavaBeanStudent() {
    }

    public JavaBeanStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
