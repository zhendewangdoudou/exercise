package jihe.collectionjihe.collectionjihee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class demo01 {
    public static void main(String[] args) {
        //创建集合对象 可以使用多态
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//重写了toString

        //add 添加元素
        coll.add("张三");
        System.out.println(coll);
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

        //remove移除元素
        boolean b2 = coll.remove("赵六");
        boolean b3 = coll.remove("赵四");
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(coll);

        //contains 是否包含e元素
        boolean b4 = coll.contains("李四");
        boolean b5 = coll.contains("赵四");
        System.out.println(b4);
        System.out.println(b5);

        //isempty为空
        Collection<String> coll2 = new ArrayList<>();
        System.out.println(coll.isEmpty());
        System.out.println(coll2.isEmpty());

        //size大小
        System.out.println(coll.size());

        //toArray集合变数组
        Object[] arr = coll.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        //clear清除集合
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());



    }
}
