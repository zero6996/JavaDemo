package com.zero.demo.Demo4_22.DemoRedPacket;


import com.zero.demo.Demo4_22.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount; // 平均值
        int mod = totalMoney % totalCount; // 余数，模，零头
        //totalcount -1 代表留一个红包
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }
        list.add(avg+mod);

        return list;
    }
}
