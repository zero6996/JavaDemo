package com.zero.demo.Demo4_20.DemoExercise;

import java.util.ArrayList;
import java.util.Random;


// 成员类
public class Member extends Users{
    public Member(){

    }

    public Member(String name, double money) {
        super(name, money);
}

    public void receive(ArrayList<Double> list){
        // 从多个红包当中随机抽取一个，给我自己。
        // 随机获取一个集和当中的索引编号
        int index = new Random().nextInt(list.size());
        // 根据索引，从集合中删除，并且得到被删除的红包值，给自己钱
        double delta = list.remove(index);
        // 成员查看一下自己的余额
        double money = super.getMoney();
        // 将得到的红包金额加入自己的余额
        super.setMoney(delta + money);
    }

}
