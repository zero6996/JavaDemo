package ZeroDemos.Demo4_26;

import javax.swing.plaf.synth.SynthTableUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        // 创建HashMap集合对象
        Map<Student, String> map = new HashMap<>();
        map.put(new Student("张三",25),"上海");
        map.put(new Student("李四",28),"北京");
        map.put(new Student("王五",20),"广州");
        map.put(new Student("赵六",19),"深圳");
        map.put(new Student("孙钱",24),"杭州");

        // 取出元素
        Set<Student> keys = map.keySet(); // 获取所以键名放入set中
        for (Student key:keys){
            System.out.println(key.toString() + "....." + map.get(key));
        }
    }
}
