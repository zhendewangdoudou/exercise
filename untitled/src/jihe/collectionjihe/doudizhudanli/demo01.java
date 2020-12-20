package jihe.collectionjihe.doudizhudanli;

import java.util.ArrayList;
import java.util.Collections;

public class demo01 {
    public static void main(String[] args) {
        //准备牌
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组组装牌
        String[] colors = {"♠","♥","❀","◇"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //大小王放入集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套
        for(String number:numbers){
            for (String color : colors) {
                //System.out.println(color+number);
                poker.add(color+number);
            }
        }
        //洗牌
        Collections.shuffle(poker);
        System.out.println(poker);
        //发牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //遍历集合 获取每张牌 使用索引%3 给三个玩家轮流发牌
        //剩余三张牌给底牌 先判断底牌（i>=51）
        for (int i = 0; i < poker.size(); i++) {
            //获取
            String p = poker.get(i);
            if(i >= 51){
                dipai.add(p);
            }else if(i%3 == 0){
                player01.add(p);
            }else if(i%3 == 1){
                player02.add(p);
            }else if(i%3 ==2) {
                player03.add(p);
            }
        }
        //4看牌
        System.out.println("1"+player01);
        System.out.println("2"+player02);
        System.out.println("3"+player03);
        System.out.println("dipai"+dipai);

    }
}
