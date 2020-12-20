package JichengyuDuotai.Jicheng.chouxiang;

import java.util.ArrayList;

//群主的类
public class demo20Manager extends demo20User{

    public demo20Manager(){

    }

    public demo20Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totoalMoney,int count){
        //首先需要一个集合来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //看一下群主自己有多少钱
        int leftmoney = super.getMoney();//群主当前余额

        if(totoalMoney > leftmoney){
            System.out.println("余额不足");
            return redList;//返回空集合
        }

        //扣钱，就是重新设置余额
        super.setMoney(leftmoney - totoalMoney);

        //发红包需要平均拆分count份
        int avg = totoalMoney / count;
        int mod = totoalMoney % count;//余数 ， 零头

        //剩下的零头抱在最后一个红包当中
        //吧红包一个一个放到集合当中
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);

        return redList;

    }
}
