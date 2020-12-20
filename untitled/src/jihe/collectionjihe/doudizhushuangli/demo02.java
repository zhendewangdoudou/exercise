package jihe.collectionjihe.doudizhushuangli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
斗地主综合案例 ：有序版本
1.准备牌
2.洗牌
3.发牌
4.排序
5.看牌
 */
public class demo02 {
    public static void main(String[] args) {
        //1 准备牌 map集合存储牌的索引和组转更好的牌
        HashMap<Integer,String> poker = new HashMap<>();
        //创建list存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个集合存储花色和序号
        String[] colors = {"♠","♥","❀","◇"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //把大小王放入集合中
        //定义索引
        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历组装牌
        for(String number:numbers){
            for (String color : colors) {
                //System.out.println(color+number);
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
//        System.out.println(poker);
//        System.out.println(pokerIndex);


        //2.洗牌
        Collections.shuffle(pokerIndex);

        //3.发牌
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        for (int i = 0; i <pokerIndex.size() ; i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if(i>=51){
                dipai.add(in);
            }else if(i % 3 == 0){
                player01.add(in);
            }else if(i % 3 == 1){
                player02.add(in);
            }else if(i % 3 == 2){
                player03.add(in);
            }
        }

        //4.排序
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(dipai);
//        System.out.println(player01);
//        System.out.println(player02);
//        System.out.println(player03);
//        System.out.println(dipai);
        //5看牌 定义一个看牌方法 提高复用性
        //参数 ：String name  玩家名称
        //       HashMap Integer,String poker
        //       Arraylist<Integer  list
        //c  查表法 遍历玩家或底牌获取索引  通过索引找到value
        lookPoker("刘德华",poker,player01);
        lookPoker("周瑞发",poker,player02);
        lookPoker("周星驰",poker,player03);
        lookPoker("底牌",poker,dipai);




    }
    public static void lookPoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        //输出玩家名称
        System.out.print(name+":");
        //bianli wangjia
        for (Integer key : list) {
            String val = poker.get(key);
            System.out.print(val+" ");
        }
        System.out.println();//打印完每个玩家的牌换行

    }
}
