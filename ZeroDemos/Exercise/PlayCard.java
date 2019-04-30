package ZeroDemos.Exercise;


import java.util.ArrayList;

public class PlayCard {
    public static void main(String[] args) {
        Poker poker = new Poker();
        poker.deal(); // 发牌
        ArrayList<String> bottomCard = poker.bottomCard;
        ArrayList<String> player1 = poker.player1;
        ArrayList<String> player2 = poker.player2;
        ArrayList<String> player3 = poker.player3;
        /*
        1. 玩家查看自己的牌,如何让玩家只看自己的牌？
        判断地主是谁？把P1号给地主，随机一个玩家为地主，随机
        2. 玩家出牌，根据索引，把牌从集合中删除，返回被删除的牌
        3. 获取这个牌，然后于上一人出的牌进行比较计算
        4. 玩家有看牌，出牌，要不起，等功能
         */
        System.out.println("1. 发牌\n2. 看牌\n3. 出牌4. 要不起" );
        while (true){
            System.out.println("玩家1操作");
        }
    }
}
