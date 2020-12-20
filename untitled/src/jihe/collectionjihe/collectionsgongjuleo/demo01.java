package jihe.collectionjihe.collectionsgongjuleo;

import java.util.ArrayList;
import java.util.Collections;

public class demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //添加多个元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        Collections.addAll(list,"a","b","c","d","e");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
