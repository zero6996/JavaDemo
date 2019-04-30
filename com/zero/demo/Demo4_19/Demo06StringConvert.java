package com.zero.demo.Demo4_19;
/*
String中与转换相关的常用方法有：

public char[] toCharArray(); 将当前字符串拆分成为字符数组作为返回值。
public byte[] getBytes(); 获取当前字符串底层的字节数组。
public String replace(CharSequence oldString, CharSequence newString);将所有出现的老字符串替换为新的字符串，返回替换后的结果新字符串。
备注：CharSequence意思是说可以接受字符串类型。


 */
public class Demo06StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars); // Hello
        System.out.println(chars[0]); // H
        System.out.println(chars.length); // 5
        System.out.println("=========================");
        String str = "abc";
        byte[] bytes = str.getBytes();
        System.out.println(bytes); //指向内存地址中abc对应的byte值
        System.out.println(bytes[0]); // [0] = 97,[1] = 98,[2] = 99
        String str2 = "你怎么回事小老弟，会不会玩啊，我**你***";
        System.out.println(str2.replace("我***你个**","儒雅随和"));

    }
}
