package com.zero.demo.demo02;

public class Demo02MethodVariable {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int s = change(a,b);
        System.out.println(s);
        System.out.println(b);

    }
    public static int change(int a,int b){
        a = a + b;
        b = b + a;
        return a;
    }
}
