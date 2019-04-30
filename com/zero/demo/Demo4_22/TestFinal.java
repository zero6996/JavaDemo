package com.zero.demo.Demo4_22;

public class TestFinal {
    // 创建类时直接初始化，并用final修饰。
/*    final String USERNAME = "张山";
    private int age;
*/
    final String USERNAME;
    private int age;

    // 使用构造方法initialize
    public TestFinal(String USERNAME, int age) {
        this.USERNAME = USERNAME;
        this.age = age;
    }
}
