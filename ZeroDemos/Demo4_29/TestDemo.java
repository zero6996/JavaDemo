package ZeroDemos.Demo4_29;
/*
    测试类
    创建包子对象
    创建包子铺线程，开启，生产包子
    创建吃货线程，开启，吃包子
 */
public class TestDemo {
    public static void main(String[] args) {
        Baozi bz = new Baozi(); // 创建包子对象
        new BaoZiPu("包子铺",bz).start(); // 创建包子铺线程，开启，生产包子
        new Chihuo("吃货",bz).start(); // 创建吃货线程，开启，吃包子
    }
}

