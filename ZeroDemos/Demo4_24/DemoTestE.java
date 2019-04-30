package ZeroDemos.Demo4_24;

public class DemoTestE {
    public static void main(String[] args) {
        // 创建一个泛型为String的类
        DemoE<String> mye = new DemoE<String>();
        // 调用set方法
        mye.setMvp("我是一个字符串");
        // 调用get方法
        String str = mye.getMvp();
        System.out.println(str);

        // 创建一个泛型为Integer的类
        DemoE<Integer> my2 = new DemoE<>();
        my2.setMvp(123);
        System.out.println(my2.getMvp());
    }
}
