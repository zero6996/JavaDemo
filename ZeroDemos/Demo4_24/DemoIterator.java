package ZeroDemos.Demo4_24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        // 添加元素
        coll.add("盖伦");
        coll.add("艾希");
        coll.add("剑圣");
        /*
            1. 使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收(多态)
         */
        //  多态 接口           实现类对象
        Iterator<String> it = coll.iterator(); // 每个集合对象都有自己的迭代器。
        while (it.hasNext()){//判断是否仍然有迭代元素
            System.out.println(it.next()); // 获取迭代出的元素
        }
    }
}
