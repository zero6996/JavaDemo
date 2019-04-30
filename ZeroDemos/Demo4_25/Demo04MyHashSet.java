package ZeroDemos.Demo4_25;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    set集合保存元素唯一：
        存储的元素(String,Integer,....student,Person),必须重写hashCode方法和equals方法

    要求：
        同名同年龄的人，视为同一人，只能存储一次
 */
public class Demo04MyHashSet {
    public static void main(String[] args) {
        // 创建hashSet集合，存储Person
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("小米",11);
        Person p2 = new Person("小米",11);
        Person p3 = new Person("小米",12);
        System.out.println(p1.hashCode()); // 1072408673
        System.out.println(p2.hashCode()); // 1531448569
        // 因为hashcode值不一样，所以认为是不同元素，没有起到去重效果。
        System.out.println(p1==p2); // false 比较对象地址值不同，也认定是两个不同元素
        System.out.println(p1.equals(p2));
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
