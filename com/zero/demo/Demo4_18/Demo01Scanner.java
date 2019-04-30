package com.zero.demo.Demo4_18;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int sum = sn.nextInt();
        System.out.println(sum);
        String str = sn.next();
        System.out.print(str);
    }
}