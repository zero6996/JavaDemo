package ZeroDemos.Demo4_26;

import java.util.HashMap;
import java.util.Set;

public class DemoGetValue {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("小明",16);
        map.put("小李",19);
        map.put("小张",17);
        map.put("小德",12);
        // 获取所以键，存储到set集合中
        Set<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key+"的年龄是："+map.get(key)+"岁");
        }
    }
}
