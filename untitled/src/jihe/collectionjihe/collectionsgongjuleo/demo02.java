package jihe.collectionjihe.collectionsgongjuleo;

import java.util.ArrayList;
import java.util.Collections;

public class demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);

        //自定义
        ArrayList<demo02person> list3 = new ArrayList<>();
        list3.add(new demo02person("张三",18));
        list3.add(new demo02person("李四",20));
        list3.add(new demo02person("王五",15));
        System.out.println(list3);
        Collections.sort(list3);
        System.out.println(list3);

    }
}
