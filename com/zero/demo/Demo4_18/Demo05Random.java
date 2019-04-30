package com.zero.demo.Demo4_18;

import java.util.Random;

public class Demo05Random {
    public static void main(String[] args) {
        int a = 0;
        while(a < 100){
            System.out.println("随机数是：" + new Random().nextInt(100));
            a++;
        }

    }
}
