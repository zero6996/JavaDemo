package ZeroDemos.Demo4_25;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("ddd");
        for(String s:set){
            System.out.println(s);
        }
    }
}
