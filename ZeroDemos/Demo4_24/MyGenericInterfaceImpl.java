package ZeroDemos.Demo4_24;

public class MyGenericInterfaceImpl implements MyGenericInterface<String> {
    @Override
    public void add(String e){
        System.out.println("接口使用泛型");
    }
    @Override
    public String getE(){
        return null;
    }
}
