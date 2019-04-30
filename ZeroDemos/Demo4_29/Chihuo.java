package ZeroDemos.Demo4_29;
/*
    消费者类：是一个线程类，可以继承Thread
    设置线程任务(run)：吃包子
    对包子状态进行判断
    false：没包子
        吃货调用wait方法进入等待状态
    true：有包子
        吃货吃包子
        吃货吃完包子
        修改包子状态为false
        吃货唤醒包子铺线程，生成包子

 */
public class Chihuo extends Thread{
    private Baozi bz; // 创建一个包子变量

    // 使用带参构造方法，为包子变量赋值
    public Chihuo(String name,Baozi bz){
        super(name);
        this.bz = bz;
}
    // 设置线程任务(run)：吃包子
    @Override
    public void run(){
        while (true){
            synchronized (bz){ // 使用同步代码块，确保线程安全
                if(bz.flag == false){  //    对包子状态进行判断
                    try{
                        bz.wait(); // false：没包子, 吃货调用wait方法进入等待状态
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
                System.out.println("吃货在吃"+bz.pier+bz.xianer+"包子!"); // 吃货吃包子
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 吃货吃完包子
                bz.flag = false; // 修改包子状态为false
                bz.notify(); //  吃货唤醒包子铺线程，生成包子
            }
        }
    }
}
