package ZeroDemos.Demo4_25;

import java.util.HashSet;

public class Demo03HashSet {
    public static void main(String[] args) {
        // 创建 Set集合
        HashSet<String> set = new HashSet<>();
        // 添加元素
        set.add(new String("cba"));
        set.add("abc");
        set.add("bac");
        set.add("cba");
        // 遍历
        for (String s:set){
            System.out.println(s); // cba,abc,bac 自动去重了
        }
    }
}
