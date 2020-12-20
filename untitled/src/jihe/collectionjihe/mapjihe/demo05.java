package jihe.collectionjihe.mapjihe;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class demo05 {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("d","d");
        map.put("b","b");
        System.out.println(map);


        LinkedHashMap<String,String> map1 = new LinkedHashMap<>();
        map1.put("a","a");
        map1.put("c","c");
        map1.put("d","d");
        map1.put("b","b");
        System.out.println(map1);


    }
}
