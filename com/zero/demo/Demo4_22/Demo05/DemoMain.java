package com.zero.demo.Demo4_22.Demo05;

/*
如果接口的实现类(或者父类的子类) 只需使用唯一的一次。
那么这种情况下就可以省略该类的定义，而改为使用[匿名内部类]

匿名内部类的定义格式：
接口名称 对象名 = new 接口名称(){
    // 覆盖重写所有抽象方法
}

对格式 “new 接口名称() {...}” 进行解析：
1. new代表创建对象的动作
2. 接口名称就是匿名内部类需要实现哪个接口
3. {...} 这是匿名内部类的内容

另外还有注意几点问题：
1. 匿名内部类，在创建对象时，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类了。
2. 匿名对象，在[调用方法]时，只能调用唯一一次，如果希望同一对象调用多次方法，那么必须给对象起名。
3. 匿名内部类是省略了[实现类/子类名称]，但匿名对象是省略了[对象名称]。匿名内部类和匿名对象不是一回事！
 */

public class DemoMain {
    public static void main(String[] args) {
        // 使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类实现了方法1！");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现方法2");
            }
        };
        obj.method();
        obj.method2();

        // 使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface(){

            @Override
            public void method() {
                System.out.println("使用匿名对象方式，该内部类方法只能调用一次");
            }

            @Override
            public void method2() {

            }
        }.method(); // 因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象才能二次调用。
    }
}
