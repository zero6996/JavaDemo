package com.zero.demo.Demo4_20;

public class NewPhone extends Phone{
    public void showNum(){
        super.showNum();
        System.out.println("来电显示姓名");
        System.out.println("来电显示头像");
    }
}
