package com.zero.demo.Demo4_19;

public class Demo04StringGet {
    public static void main(String[] args) {
        int length = "abcdefghijklmnobqrstuvwxyz".length();
        System.out.println("字符串长度为：" + length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1); // Hello
        System.out.println(str2); // World
        System.out.println(str3); // HelloWorld
        System.out.println("Hello".charAt(0)); // H
        String str4 = str3;
        System.out.println(str4.indexOf("llo"));
    }
}
