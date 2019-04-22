package Demo4_22.DemoRedPacket;

/*
场景说明：
    红包发出去后，所有人都有红包，大家抢完后，最后一个红包给群主自己

我们需要做的事情：
    1. 设置程序的标题，通过构造方法的字符串参数
    2. 设置群主名称
    3. 设置分发策略：平均 or 随机

红包分发策略：
    1. 普通红包(平均)：totalMoney / totalCount, 余数放在最后一个红包中。
    2. 手气红包(随机)：最少一分钱，最多不超过平均数的2倍。应该越发越少。

 */


import Demo4_22.red.OpenMode;
import Demo4_22.red.RedPacketFrame;

public class Bootstrap {
    public static void main(String[] args) {
        MyRed red = new MyRed("红包"); // 标题
        // 设置群主名称
        red.setOwnerName("王老板");

        // 普通红包
//        OpenMode normal = new NormalMode();
//        red.setOpenWay(normal);
        OpenMode random = new RandomMode();
        red.setOpenWay(random);
    }
}
