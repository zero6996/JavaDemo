package com.zero.demo.Demo4_18;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Max = 0;
        for(int i = 1;i < 4;i++){
            System.out.println("请输入第" + i + "个数字：");
            int temp = sc.nextInt();
            if(temp > Max){
                Max = temp;
            }
        }
        System.out.println("最大数是：" + Max);

    }
}
