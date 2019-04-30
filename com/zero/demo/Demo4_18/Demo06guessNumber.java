package com.zero.demo.Demo4_18;

import java.util.Random;
import java.util.Scanner;

public class Demo06guessNumber {
    public static void main(String[] args) {
        int number = new Random().nextInt(100) + 1;
        int count = 0;
        while (true){
            System.out.println("请输入你要猜的数字(1-100)：");
            int guessNumber = new Scanner(System.in).nextInt();
            if(guessNumber > number){
                System.out.println("You enter number is big , again! ");
            }else if(guessNumber < number){
                System.out.println("You enter number is small , again!");
            }else{
                System.out.println("Bin1go！你使用了" + count + "次。");
                break;
            }
            count++;
        }
    }
}
