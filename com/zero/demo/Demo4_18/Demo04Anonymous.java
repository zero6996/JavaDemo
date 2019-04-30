package com.zero.demo.Demo4_18;

import java.util.Scanner;

public class Demo04Anonymous {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input(sc);
        //input(new Scanner(System.in));
        Scanner sc1 = getScanner();
        input(sc1);
    }
    public static void input(Scanner sc){
        System.out.println(sc);
    }
    public static Scanner getScanner(){
        return new Scanner(System.in);
    }
}

