package commonAPI1;

import java.util.ArrayList;

public class demo04arraylist {
    public static void main(String[] args) {

        //创建一个Arraylist集合，集合的名称是list，里面装的都是String字符串类型数据
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);//空

        /*
        //添加数据 add方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马儿扎哈");
        System.out.println(list);
         */

        //向集合中添加元素：add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println(success);//返回值为添加是否成功

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list);

        //从集合中获取元素 get 索引值从0开始
        String name = list.get(2);
        System.out.println(name);

        //从集合中删除李小璐
        String whoRemoved = list.remove(3);
        System.out.println("被删除的是"+whoRemoved);
        System.out.println(list);

        //集合的尺寸长度
        System.out.println(list.size());

    }
}
