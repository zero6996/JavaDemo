package com.zero.demo.Demo4_19;

import java.util.Scanner;

/*
键盘输入一个字符串，统计其中各种字符出现次数，返回次数。
字符种类：大写字母，小写字母，数字，其他

 */
public class Demo09StringExercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String input = sc.next(); // 获取键盘输入的字符串
        System.out.println(stringCount(input));
    }
    public static String stringCount(String input){
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        int countOther = 0;
        char[] chars = input.toCharArray();
        for(int i = 0;i < chars.length;i++){
            char ch = chars[i]; // 单个字符，底层表示为byte[]数值
            if(ch >= 'A' && ch <= 'Z'){
                countUpper++;
            }else if (ch >= 'a' && ch <= 'z'){
                countLower++;
            }else if (ch >= '0' && ch <= '9'){
                countNumber++;
            }else{
                countOther++;
            }
        }
        return "大写字母："+countUpper+"\n小写字母："+countLower+"\n数字:"+countNumber+"\n其他类型："+countOther;
    }
}
