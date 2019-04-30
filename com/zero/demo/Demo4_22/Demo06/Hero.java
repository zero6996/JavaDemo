package com.zero.demo.Demo4_22.Demo06;

public class Hero {
    private String name; // 名称
    private int blood;  // 生命值
    private Weapon weapon; // 添加武器属性

    public Hero() {
    }

    public Hero(String name, int blood, Weapon weapon) {
        this.name = name;
        this.blood = blood;
        this.weapon = weapon;
    }

    public void attack(){
        System.out.println(name+"使用了"+weapon.getName()+"攻击敌方");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int age) {
        this.blood = blood;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
