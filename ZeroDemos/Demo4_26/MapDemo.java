package ZeroDemos.Demo4_26;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        // 创建Map对象
        HashMap<String,Integer> map = new HashMap<>();
        // put(键,值)添加元素
        System.out.println(map.put("小明",15)); // 如果添加的元素对键名没有在集合中，会返回一个null，并添加元素
        System.out.println(map.put("小明",11)); // 如果添加的元素对键名在集合中存在，则返回该键对应的值，然后更新值
        map.put("小张",18);
        map.put("李小",16);
        System.out.println(map); // {小明=15, 小张=18, 李小=16}
        // remove(键名)删除指定元素
        System.out.println(map.remove("李小"));
        System.out.println(map); // {小明=15, 小张=18}
        // 通过键名查询对应的值
        System.out.println(map.get("小明")); // 15
        System.out.println(map.get("小张")); // 18
    }
}
