package com.zero.demo.demo01;

public class Demo04sumMethod {
    public static void main(String[] args){
        System.out.println("1~100的值为：" + getSum(1,100));
    }
    public static int getSum(int a, int b){
        int sum = 0;
        while(a <= b){
            sum += a;
            a++;
        }
        return sum;
    }
}
