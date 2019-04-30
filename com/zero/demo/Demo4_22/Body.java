package com.zero.demo.Demo4_22;

public class Body { // 内部类

    public class Heart{ // 成员内部类

        // 内部类方法
        public void beat(){
            System.out.println("心脏跳动：砰砰砰！");
            System.out.println("我叫：" + name); // 内部类可以直接访问外部类成员变量
        }
    }

    private String name; // 外部类成员变量

    // 外部类方法
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat(); // 匿名对象
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
