package com.zero.demo.Demo4_19;
/*
字符串分割方法：
public String[] split(String regex); 按照参数的规则，将字符串切分为若干部分。

 */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str1 = "a,b,c";
        String[] array1 = str1.split(",");
        for(int i = 0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        String str2 = "a b c";
        String[] array2 = str2.split(" ");
        for(int i=0;i<array2.length;i++){
            System.out.println(array2[i]);
        }
        String str3 = "XXX.YYY.ZZZ";
        String[] array3 = str3.split("\\."); //注意转义
        for (int i=0;i<array3.length;i++){
            System.out.print(array3[i]);
        }
    }
}
