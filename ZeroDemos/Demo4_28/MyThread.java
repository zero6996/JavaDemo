package ZeroDemos.Demo4_28;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name); // 访问父类的带参构造方法
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println(getName()+i);
        }
    }
}
