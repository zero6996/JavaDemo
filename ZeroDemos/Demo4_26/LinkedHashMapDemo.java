package ZeroDemos.Demo4_26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkMap = new LinkedHashMap<>();
        linkMap.put("小米",11);
        linkMap.put("小花",15);
        linkMap.put("小中",19);
        Set<Map.Entry<String,Integer>> entrys = linkMap.entrySet();
        for(Map.Entry<String,Integer> entry:entrys){
            System.out.println(entry.getKey() + "的年龄是：" + entry.getValue() + "岁");
        }
    }
}
