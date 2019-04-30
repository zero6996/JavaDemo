package ZeroDemos.Demo4_24;

public class GenericMethodDemo {
    public static void main(String[] args) {
        // 创建对象
        MyGenericMethod mgm = new MyGenericMethod();
        // 调用方法
        mgm.show("aaa");
        mgm.show(123);
        mgm.show('A');
        mgm.show(1.30);
    }
}
