package com.zero.demo.Demo4_20.DemoExercise;

import java.util.ArrayList;

// 群主类
public class Manager extends Users{
    public Manager(){ // 无参构造方法

    }

    public Manager(String name, double money) { // 全参构造方法
        super(name, money); // 调用了父类的构造方法，并初始化值
    }

    // 定义群主发红包方法，参数为发红包金额和份数
    public ArrayList<Double> send(double totalMoney, int count){
        // 首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Double> redList = new ArrayList<>();
        //首先看一下群主有多少钱
        double leftMoney = super.getMoney(); // 群主当前余额
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList; // 返回空集合
        }

        //扣钱，其实就是重置余额
        super.setMoney(leftMoney - totalMoney);

        //发红包需平均拆分为count份
        double avg = (int)totalMoney / count; // int化后丢失精度,如何把零头单独拿出来？
        double mod = totalMoney - avg * count;//余数，也就是甩下的零头
        // 除不来的零头，包在最后一个红包里
        // 下面把红包一个一个放到集合中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        double last = avg + mod; //最后一个红包
        redList.add(last);

        return redList; // 返回的是一个红包数组集合
    }
}
