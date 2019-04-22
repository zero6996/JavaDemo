package Demo4_22.DemoRedPacket;

import Demo4_22.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        /* 随机分配，可能多可能少
         最少一分钱，最多不超过“剩下金额平均数的2倍”
         第一次发红包，随机范围是0.01元~6.66元
         第二次发红包，剩下的至少是3.34元。
         此时还需发2个红包。
         此时再发范围是0.01~3.34元(取不到右边，剩下0.01)

         总结一下：范围公式是：1 + random.nextInt(leftMoney / leftCount * 2);
        */

        Random r = new Random(); // 创建一个随机数生成器
        // totalMoney是总金额，totalcount总分数，不变
        // 额外定义两个变量，分别代表剩下多少钱，多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        // 随机发前n-1个，最后一个不用随机了
        for (int i = 0; i < totalCount - 1; i++) {
            int money = r.nextInt(leftMoney / leftCount * 2) + 1;
            list.add(money); // 将一个随机红包放入集合
            leftMoney -= money; // 减去发出的红包金额
            leftCount --; // 剩下还应该再发的红包个数
        }
        // 最后一个红包不用随机，直接放入即可
        list.add(leftMoney);
        return list;
    }
}
