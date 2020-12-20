package jihe.collectionjihe.fanxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class demo04tongpeifu {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("b");

        printArra(list1);
        printArra(list2);
    }

    //定义方法  遍历所有类型list集合
    //此时不知道类型
    public static void printArra(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while (it.hasNext()){
            Object o = it.next();
            System.out.println(o);
        }
    }
}
