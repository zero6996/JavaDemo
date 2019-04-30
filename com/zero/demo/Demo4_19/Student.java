package com.zero.demo.Demo4_19;

public class Student {
    private int sid; //学号
    private String name;
    private int age;
    static String room;
    public static int idCount = 0; //自动分配学号

    public Student() {
        this.sid = ++idCount;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.sid = ++idCount;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Student.idCount = idCount;
    }

}
