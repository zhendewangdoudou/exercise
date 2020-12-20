package JichengyuDuotai.Jicheng.neibulei;

import java.util.ArrayList;
import java.util.Random;

public class demo18randomMode implements demo18OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        //随机分配 最少1分钱 最多不超过剩下金额平均数的2倍
        //第一次发 0.01-3.33*2  10元3个包
        //剩下的最少3.3.4元
        //此时还要再发两个红包 范围0.01-3.33元
        //公式 1 + random.nextint(leftmoney / leftcount*2)
        Random r = new Random();//随机数生成器
        //totalmoney 总金额 totalcount 总份数
        //额外两个变量 剩多少钱  剩多少份
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        //随机发钱n-1个最后一个不需要随机
        for (int i = 0; i < totalCount-1; i++) {
            int money = r.nextInt(leftMoney / leftCount *2)+1;//最少1分
            list.add(money);//将红包包好 放进去
            leftMoney -= money;//总金额越发越少
            leftCount --;//剩下应该发的红包个数 递减
        }
        //最后一个不用随机
        list.add(leftMoney);

        return list;
    }
}
