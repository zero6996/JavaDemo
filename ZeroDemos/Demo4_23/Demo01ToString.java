package ZeroDemos.Demo4_23;

import java.util.ArrayList;

public class Demo01ToString {
    public static void main(String[] args) {
//        Person p = new Person("张",13);
//        System.out.println(p.toString());

        Person p1 = new Person("p1",18);
        Person p2 = new Person("p2",18);
        System.out.println(p1.equals(p2));
        p1 = p2;
        System.out.println(p1.equals(p2));

        ArrayList<String> list = new ArrayList<>();
        System.out.println(p1.equals(p1));
    }
}
