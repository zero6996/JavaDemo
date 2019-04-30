package com.zero.demo.Demo4_22.Demo06;

public class DemoMain {
    public static void main(String[] args) {
        // 创建英雄对象
        Hero hero = new Hero();
        // 创建武器对象
        Weapon wp = new Weapon("霜之哀伤");
        hero.setName("伊利丹"); // 设置英雄名字
        hero.setWeapon(wp); // 将武器交给英雄
        hero.attack(); // 攻击
    }
}
