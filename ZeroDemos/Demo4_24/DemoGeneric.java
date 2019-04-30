package ZeroDemos.Demo4_24;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoGeneric {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
        coll.add(5); // 由于集合没有做泛型限定，任何类型都可以存放
        Iterator it = coll.iterator();
        while (it.hasNext()){
            System.out.println(((String)it.next()).length());
        }
    }
}
