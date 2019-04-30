package ZeroDemos.Demo4_25;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {
        // 创建List集合对象
        List<String> list =  new ArrayList<String>();

        //往 尾部添加 元素
        list.add("小米");
        list.add("小天");
        list.add("小风");
        System.out.println(list);  // [小米, 小天, 小风]

        // add(int index,String s) 往指定位置添加元素
        list.add(1,"小洪");
        System.out.println(list); // [小米, 小洪, 小天, 小风]
        // remove(int index) 删除指定位置元素，返回被删除元素
        System.out.println("删除索引位置为2的元素"+list.remove(2)); // 删除索引位置为2的元素小天
        // set(int index, String s) 将指定位置的元素进行替换(修改)
        System.out.println(list.set(1,"小华")); // 返回的是被替换的元素， 小洪
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)); // get(int index) 获取指定索引位置的元素
        }
    }
}
