package ZeroDemos.Demo4_29;
/*
    生成者(包子铺)类：是一个线程类，可以继承Thread
    设置线程任务(run)：生成包子
    对包子状态进行判断
    true：有包子
        包子铺调用wait方法进入等待状态
    false：没包子
        包子铺生产包子
        包子铺生成好了包子
        修改包子的状态为true
        唤醒吃货线程，起来吃包子了

    注意：
        包子铺线程和包子线程关系--->通信(互斥)
        必须使用同步技术保证两个线程只能有一个在执行
        锁对象必须保持唯一，可以使用包子对象作为锁对象
        包子铺类和吃货的类就需要把包子对象作为参数传递进来
            1.需要在成员位置创建一个包子变量
            2.使用带参构造方法，为包子变量赋值
 */
public class BaoZiPu extends Thread{ // 生成者(包子铺)类：是一个线程类，可以继承Thread
    // 1.需要在成员位置创建一个包子变量
    private Baozi bz;
    // 2.使用带参构造方法，为包子变量赋值
    public BaoZiPu(String name, Baozi bz){
        super(name);
        this.bz = bz;
    }

    // 设置线程任务(run)：生成包子
    /*
    包子铺线程和包子线程关系--->通信(互斥)
        必须使用同步技术保证两个线程只能有一个在执行
        锁对象必须保持唯一，可以使用包子对象作为锁对象
        包子铺类和吃货的类就需要把包子对象作为参数传递进来
            1.需要在成员位置创建一个包子变量
            2.使用带参构造方法，为包子变量赋值
     */
    @Override
    public void run(){
        int count = 0;
        // 造包子
        while (true){
             // 必须使用同步技术保证两个线程只能有一个在执行
            synchronized (bz) {
                if (bz.flag == true) { // 对包子状态进行判断
                    try {
                        bz.wait(); // true：有包子,包子铺调用wait方法进入等待状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 没有包子，包子铺生产包子
                System.out.println("包子铺开始做包子");
                if (count % 2 == 0) {
                    bz.pier = "面皮";
                    bz.xianer = "五花肉";
                } else {
                    bz.pier = "薄皮";
                    bz.xianer = "韭菜鸡蛋";
                }
                count++;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 包子铺生成好了包子
                bz.flag = true; // 修改包子的状态为true
                System.out.println("包子造好了：" + bz.pier + bz.xianer+",吃货来吃吧!");
                bz.notify(); // 唤醒吃货线程，起来吃包子了
            }
        }
    }
}
