package jihe.collectionjihe.setjihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class demo01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用迭代器遍历set
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        //增强for
        for (Integer integer : set) {
            System.out.println(integer);
        }


    }
}
