package com.zero.demo.Demo4_19;

/*
字符串的截取方法：

public String substring(int index):截取从参数位置一直到字符串末尾，返回新字符串
public String substring(int begin,int end):截取从begin开始，一直到end结束，中间的字符串。[begin,end)，包含左边，不包含右边。
 */
public class Demo05SubString {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        System.out.println(str1.substring(5)); // 返回World
        System.out.println(str1.substring(4,7)); // owo , 4~6不含7
    }
}
