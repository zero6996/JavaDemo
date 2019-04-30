package com.zero.demo.demo02;

public class Demo02ArrayReverse {
    public static void main(String[] args){
        /*int [] arr1 = reverse1();
        for(int j = 0;j<5;j++) {
            System.out.println(arr1[j]);
        }
        */
        int [] arr2 = reverse2();
        for(int j = 0;j<5;j++) {
            System.out.println(arr2[j]);
        }
    }
    public static int[] reverse1(){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        int s = arr1.length-1;
        for(int i = 0;i < arr1.length;i++,s--){
            arr2[s] = arr1[i];

        }
        return arr2;
    }
    public static int[] reverse2(){
        int[] arr = {1,2,3,4,5};
        for(int min = 0,max = arr.length-1;min <= max; min++,max--){
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }
        return arr;
    }
}
