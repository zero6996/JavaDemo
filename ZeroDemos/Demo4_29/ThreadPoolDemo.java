package ZeroDemos.Demo4_29;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        // 创建线程池对象
        ExecutorService service = Executors.newFixedThreadPool(2); // 创建了包含2个线程对象的线程池
        // 创建Runnable实例对象
        MyRunnable r = new MyRunnable();
//        new Thread(r).start(); // 使用传统方式，自己创建线程对象
        service.submit(r); // 从线程池中获取线程对象，然后会自动调用MyRunnable中的run()
        service.submit(r); // 再次获取一个线程对象
        service.submit(r); // again
        /*
            注意：submit方法调用结束后，程序并没终止，是因为线程池控制了线程的关闭
            将使用完的线程又归还到了线程池中
         */
        service.shutdown();
    }
}
