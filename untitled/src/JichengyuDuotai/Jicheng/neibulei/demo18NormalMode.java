package JichengyuDuotai.Jicheng.neibulei;

import java.util.ArrayList;

public class demo18NormalMode implements demo18OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int avg = totalMoney / totalCount;//平均值
        int mod = totalMoney % totalCount;//余数零头
        for (int i = 0; i < totalCount-1; i++) {//将平均数放进去，最后一个不放
            list.add(avg);
        }
        list.add(avg+mod);//有零头需要放在最后一个红包中

        return list;
    }
}
