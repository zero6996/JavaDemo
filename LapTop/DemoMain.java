package Demo4_21.ExerciseDemo;

import java.security.Key;

public class DemoMain {
    public static void main(String[] args) {
        // 首先创建一个电脑
        Laptop laptop = new Laptop();
        laptop.powerOn();

        // 准备一个鼠标,供电脑使用
        USB usbMouse = new Mouse(); // 首先向上转型
        laptop.usbDevice(usbMouse);

        // 创建一个USB键盘
        Keyboard keyboard = new Keyboard(); //没有使用多态写法
        // 方法参数是USB类型，传递进去的是实现类对象
        laptop.usbDevice(keyboard); // 正确写法！ 自动发生了向上转型！

        laptop.powerOff();
    }
}
//接口的基本使用
//对象的上下转型
//        接口作为对象参数的使用