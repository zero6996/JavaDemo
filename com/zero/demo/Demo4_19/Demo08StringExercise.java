package com.zero.demo.Demo4_19;

public class Demo08StringExercise {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(arrayToString(arr));

    }
    public static String arrayToString(int[] arr){
        String str = "[";
        for (int i=0;i<arr.length;i++){
            if(i != arr.length-1){
                str += (arr[i]+"#");
            }else{
                str += (arr[i]+"]");
            }
        }
        return str;
    }
}
