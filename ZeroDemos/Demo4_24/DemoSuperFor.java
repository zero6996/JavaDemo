package ZeroDemos.Demo4_24;

import java.util.ArrayList;
import java.util.Collection;

public class DemoSuperFor {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7};
        for(int a:arr){// a代表数组中的每个元素
            System.out.println(a);
        }
        Collection<String> coll = new ArrayList<>();
        coll.add("蛮王");
        coll.add("剑圣");
        coll.add("赵信");
        // 使用增强for遍历
        for(String s:coll){ // 变量s代表被遍历到的集合园
            System.out.println(s);
        }
    }
}
