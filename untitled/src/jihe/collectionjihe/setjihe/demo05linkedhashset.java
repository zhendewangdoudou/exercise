package jihe.collectionjihe.setjihe;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class demo05linkedhashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast") ;
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast") ;
        System.out.println(linked);


    }
}
