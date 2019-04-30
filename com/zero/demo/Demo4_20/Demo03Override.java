package com.zero.demo.Demo4_20;
/*
方法覆盖重写的注意事项：
1. 必须保证父子类之间方法的名称相同，参数列表也相同。
@Override:写在方法前面,检测是否是有效的正确覆盖重写，可选
2. 子类方法的返回值必须小于等于父类方法的返回值范围。
扩展：java.lang.Object类是所有类的公共最高父类(祖宗类),String是Object的子类。
3. 子类方法的权限必须大于等于父类方法的权限修饰符。
扩展：public > protected > (default) > private 注：(default)不是关键字default，而是什么都不写，留空。
 */
public class Demo03Override {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
    }

    public static class Fu {
         public void method(){
             System.out.println("fu method");
        }
    }

    public static class Zi extends Fu {

        @Override
        public void method(){
            System.out.println("zi method");
        }
    }
}
