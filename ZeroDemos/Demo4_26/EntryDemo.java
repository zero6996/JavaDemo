package ZeroDemos.Demo4_26;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("小米",32);
        map.put("小花",25);
        map.put("小马",52);
        Set<Map.Entry<String,Integer>> entrys = map.entrySet();
        for (Map.Entry<String,Integer> entry:entrys){
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key+"的年龄是:"+value+"岁");
        }
    }
}
