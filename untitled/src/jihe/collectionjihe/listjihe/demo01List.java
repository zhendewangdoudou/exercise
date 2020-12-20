package jihe.collectionjihe.listjihe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo01List {
    public static void main(String[] args) {
        //创建list  使用多态
        List<String> list = new ArrayList<>();
        //add添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);//重写了toString
        //add(int index,E element)
        list.add(3,"itheima");
        System.out.println(list);
        //remove（int index)
        System.out.println(list.remove(2));
        //set(int index, E element)
        System.out.println(list.set(4,"A"));
        System.out.println(list);

        //list 遍历
        //1for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //2迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //3.zengqiangfor、
        for (String s : list) {
            System.out.println(s);
        }
    }
}
