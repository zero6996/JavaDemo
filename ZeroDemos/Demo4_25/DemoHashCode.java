package ZeroDemos.Demo4_25;
/*
    哈希值：是一个十进制的整数，由系统随机给出(就是对象的地址值，是一个逻辑地址，不是数据实际存储的物理地址)
    在Object类有一个方法，可以获取对象的哈希值
    int hashCode() 返回该对象的哈希码值
    hashCode()方法的源码：
        public native int hashCode();
        native:代办该方法调用的是本地操作系统的方法。
 */
public class DemoHashCode {
    public static void main(String[] args) {
        // Person类继承了Object类，所以可以使用Object类的hashCode方法
        Person p1 = new Person();
        System.out.println(p1.hashCode()); // 1072408673
        System.out.println(new Person().hashCode()); // 1531448569

        System.out.println("abc".hashCode()); // 96354
        // 以下两个为特殊情况，内容不同hash值相同
        System.out.println("重地".hashCode()); // 1179395
        System.out.println("通话".hashCode()); // 1179395
    }
}
