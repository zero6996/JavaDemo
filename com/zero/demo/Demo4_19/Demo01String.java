package com.zero.demo.Demo4_19;

/*

字符串的特点：
1. 字符串的内容永不可变。
2. 因为不可变，所以字符串是可以共享的
3. 字符串效果上相当于是char[]字符数组，但底层原理是byte[]字节数组。

创建字符串的常见3+1种方式
三种构造方法：
public String(): 创建一个空白字符串，不含有任何内容。
public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
public String(byte[] array): 根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str = "Hello";

注意：直接写上双引号，就是字符串对象。

 */

public class Demo01String {
    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String();
        System.out.println("使用空参构造："+str1);
        // 根据字符数组创建字符串
        char[] charArray = {'a','b','c'};
        System.out.println("根据字符数创建字符串:" + new String(charArray));
        //根据字节数组创建字符串
        byte[] byteArray = {97,98,99};
        System.out.println("根据字节数组创建字符串:"+ new String(byteArray));
    }
}
