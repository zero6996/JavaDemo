package ZeroDemos.Demo4_27;

import java.io.FileNotFoundException;

public class TryCatchDemo {
    public static void main(String[] args) {
        try{ // 当产生异常时，必须有处理方式，要么捕获，要么声明。
            read("b.txt");
        }catch (FileNotFoundException e){ // try中抛出的是什么异常，在括号中就定义什么异常
            System.out.println(e);
        }
        System.out.println("over");
    }
    public static void read(String path) throws FileNotFoundException{
        if(!path.equals("a.txt"))
            throw new FileNotFoundException("文件不存在");
    }
}
