package ZeroDemos.Demo4_27;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowDemo02 {
    public static void main(String[] args) throws IOException{
        read("a.txt");
    }
    // 如果定义功能时有问题发生需要报告给调用者。可以通过在方法上使用throws关键字进行声明
    // 假如该方法可能有多种异常情况产生，那么throws后面可以写多个异常类，用逗号隔开。
    public static void read(String path) throws FileNotFoundException, IOException {
        if(!path.equals("a.txt")) // 如果不是a.txt这个字符串
            throw new FileNotFoundException("文件不存在"); // 则生成一个异常类返回给调用者
        if(!path.equals("b.txt"))
            throw new IOException();
    }
}
