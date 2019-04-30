package com.zero.demo.demo01;

/*
复习一下此前学习的方法基础入门知识：

定义格式：
public static void 方法名称（）{
    方法体
}

调用格式：
方法名称();
*/
public class Demo01Method {
    public static void main(String[] agrs){
        print();
    }

    public static void print(){
        for(int j = 0;j < 5; j++){
            for(int i = 0;i < 5;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
