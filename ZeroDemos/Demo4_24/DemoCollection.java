package ZeroDemos.Demo4_24;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>(); // 创建集合对象，多态写法
        // 使用添加功能，add(String s)；
        coll.add("小米");
        coll.add("小洪");
        coll.add("小丽");
        System.out.println(coll); // [小米, 小洪, 小丽]
        // 使用判断功能 contains(String s);
        System.out.println(coll.contains("小张")); // false
        System.out.println(coll.contains("小米")); // true
        System.out.println(coll.size()); // 返回集合中元素个数

        System.out.println(coll.remove("小洪"));
        System.out.println(coll);
        Object[] obj = coll.toArray(); // 转换成一个Object数组
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
        coll.clear(); // 清空集合
        System.out.println(coll.isEmpty()); // 判断集合是否为空
    }
}
