package ZeroDemos.Demo4_24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoGeneric02 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("itcast");
        //list.add(5); // 编译不通过，类型不同
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next(); // 当使用了Iterator<String>控制元素类型后，就不用强转了。
            System.out.println(str.length());
        }
    }
}
