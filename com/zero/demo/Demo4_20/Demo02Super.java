package com.zero.demo.Demo4_20;

public class Demo02Super {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.show();
    }
}

class Fu1{
    int num = 5;
}
class Zi1 extends Fu1{
    int num = 6;
    public void show(){
        // 访问父类中的num
        System.out.println("父类num：" + super.num);
        //访问子类中的num
        System.out.println("子类num：" + this.num);
    }
}