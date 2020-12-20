package JichengyuDuotai.Jicheng.chouxiang;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class demo20member extends demo20User{

    public demo20member() {
    }

    public demo20member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){

        //从多个红包中随便抽取一个给自己
        //随机获取一个list集合中的索引编号
        int index = new Random().nextInt(list.size());

        //根据索引从集合当中删除，并且得到被删除的红包给自己
        int delta = list.remove(index);//小红包金额
        //本来有多少钱
        int money = super.getMoney();
        //获得后重新设置回去
        super.setMoney(money + delta);
    }
}
