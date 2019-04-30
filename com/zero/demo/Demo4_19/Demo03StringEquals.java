package com.zero.demo.Demo4_19;

/*
==是进行对象的地址值比较，如果需要对字符串内容比较，可以使用两个方法：
public boolean equals(Obj)


 */

public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str3));

        String str4 = null;
        System.out.println("abc".equals(str4)); // false 推荐写法
        System.out.println(str4.equals("abc")); // 报错，NullPointerException

        String str5 = "JAVA";
        String str6 = "java";
        System.out.println(str5.equalsIgnoreCase(str6)); // true

    }
}
