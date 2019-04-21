package Demo4_21.ExerciseDemo;

public class Laptop {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    // 使用USB设备的方法，使用接口作为方法参数
    public void usbDevice(USB usb){
        usb.open();
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb; // 向下转型
            mouse.click();
        }else if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.click();
        }
        usb.close();
    }
}
