package ZeroDemos.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Poker {
    final static ArrayList<String> bottomCard = new ArrayList<>(); // 底牌
    final static ArrayList<String> player1 = new ArrayList<>(); // 玩家1
    final static ArrayList<String> player2 = new ArrayList<>(); // 玩家2
    final static ArrayList<String> player3 = new ArrayList<>(); // 玩家3

    // 牌盒，返回一组HashMap的牌
    public static HashMap<Integer,String> CardBox(){
        // 准备牌
        List<String> colors = List.of("♥","♦","♠","♣");
        List<String> numbers = List.of("2","3","4","5","6","7","8","9","10","J","Q","K","A");
        HashMap<Integer,String> pokerMap = new HashMap<>();
        int cardID = 0;
        for (String color:colors){
            for (String num:numbers){
                pokerMap.put(cardID,color+num); // 0,"♥2"
                cardID++;
            }
        }
        pokerMap.put(52,"小☺");
        pokerMap.put(53,"大☠");
        return pokerMap;
    }
    // 洗牌
    public static List<Integer> shuffle(HashMap<Integer,String> pokerMap){
        ArrayList<Integer> cardKeys = new ArrayList<>();
        cardKeys.addAll(pokerMap.keySet());// 获取map的键名集合，并转换为List集合，方便打乱。
        //        // 打乱顺序，洗牌
        Collections.shuffle(cardKeys); // 牌编号集合
        return cardKeys;
    }

    // 发牌
    public static void deal(){
        HashMap<Integer,String> pokerMap = CardBox();
        List<Integer> cardKeys = shuffle(pokerMap);
        // 发牌的编号
        for (int i = 0;i < cardKeys.size();i++){
            if (i >= 51){
                bottomCard.add(pokerMap.get(cardKeys.get(i))); // 根据牌编号，获取对应在牌盒中的牌，放入底牌
            }else if (i % 3 == 0){
                player1.add(pokerMap.get(cardKeys.get(i))); // 根据牌编号，获取对应在牌盒中的牌，放入玩家1手中
            }else if (i % 3 == 1){
                player2.add(pokerMap.get(cardKeys.get(i))); // 根据牌编号，获取对应在牌盒中的牌，放入玩家2手中
            }else{
                player3.add(pokerMap.get(cardKeys.get(i))); // 根据牌编号，获取对应在牌盒中的牌，放入玩家3手中
            }
        }
        // 排序
        Collections.sort(bottomCard);
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
    }
}