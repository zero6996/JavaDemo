package com.zero.demo.Demo4_20.DemoExercise;

public class Users {
    private String name;
    private double money;

    public Users() {
    }

    public Users(String name, double money) {
        this.name = name;
        this.money = money;
    }
    public void show(){
        System.out.println("我叫"+name+"，我有"+money+"块钱");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
