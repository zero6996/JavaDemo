package ZeroDemos.Demo4_24;

public class GenericTest {
    public static void main(String[] args) {
        MyImpl2<String> my = new MyImpl2<String>(); // 在创建对象时指定泛型类型
        my.add("aa");
        MyImpl2<Integer> my2 = new MyImpl2<Integer>();
        my2.add(1);
    }
}
