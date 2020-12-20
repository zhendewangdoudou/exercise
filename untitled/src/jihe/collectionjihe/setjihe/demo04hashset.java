package jihe.collectionjihe.setjihe;

import java.util.HashSet;

/*
set集合保证存储元素唯一
  存储元素 ，必须重写hashcode和equals
  要求 同名和同年龄的人为同一个人 只能存储一次
 */
public class demo04hashset {
    public static void main(String[] args) {
        HashSet<demo04person> set = new HashSet<>();
        demo04person p1 = new demo04person("美女",18);
        demo04person p2 = new demo04person("美女",18);
        demo04person p3 = new demo04person("美女",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }

}
