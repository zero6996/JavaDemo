package ZeroDemos.Demo4_24;


// 自定义一个含有泛型的方法
public class MyGenericMethod {
    public <MVP> void show(MVP mvp){
        System.out.println(mvp.getClass()); // 获取当前类对象
    }
    public <MVP> MVP show2(MVP mvp){
        return mvp;
    }
}
