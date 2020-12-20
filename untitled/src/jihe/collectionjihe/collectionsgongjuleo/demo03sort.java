package jihe.collectionjihe.collectionsgongjuleo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class demo03sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序
            }
        });
        System.out.println(list);

        ArrayList<demo03student> list2 = new ArrayList<>();
        list2.add(new demo03student("迪丽",18));
        list2.add(new demo03student("故里",20));
        list2.add(new demo03student("b杨幂",17));
        list2.add(new demo03student("a赵丽",17));
        System.out.println(list2);
        Collections.sort(list2, new Comparator<demo03student>() {
            @Override
            public int compare(demo03student o1, demo03student o2) {
                int result = o1.getAge()-o2.getAge();
                //如果两个人年龄相同，使用姓名diige zi比较
                if(result == 0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list2);
    }
}
