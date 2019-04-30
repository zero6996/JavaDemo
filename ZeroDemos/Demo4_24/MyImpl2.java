package ZeroDemos.Demo4_24;

public class MyImpl2<E> implements MyGenericInterface<E>{

    @Override
    public void add(E e) {
        System.out.println("在创建对象时会确认泛型的类型");
    }

    @Override
    public E getE() {
        return null;
    }
}
