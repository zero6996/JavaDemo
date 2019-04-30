package com.zero.demo.Demo4_18;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        System.out.println("请输入两个数字：");
        Scanner sc = new Scanner(System.in);
        System.out.print("两数之和是：" + (sc.nextInt()+ sc.nextInt()));
    }
}
