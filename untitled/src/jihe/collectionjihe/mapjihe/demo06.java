package jihe.collectionjihe.mapjihe;

import java.util.HashMap;
import java.util.Hashtable;

public class demo06 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> table = new Hashtable<>();
        table.put(null,"a");
        table.put("b",null);
        table.put(null,null);
        System.out.println(table);
    }
}
