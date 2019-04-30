package com.zero.demo.demo02;

public class Demo02ArrayMAX {
    public static void main(String[] args){
        int[] arr = {5,15,2000,10000,100,4000};
        int max = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("arr数组最大值为：" + max);
    }
}
