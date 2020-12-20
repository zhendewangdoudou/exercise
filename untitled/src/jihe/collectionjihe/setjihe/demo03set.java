package jihe.collectionjihe.setjihe;

import java.util.HashSet;

public class demo03set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        System.out.println("abc");
        System.out.println(set);

    }
}
