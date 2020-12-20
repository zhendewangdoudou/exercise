package jihe.collectionjihe.mapjihe;

import java.util.HashMap;
import java.util.Map;

public class demo01 {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }
    public static void show04(){
        Map<String,Integer> map = new HashMap<>();
        map.put("zhaoliying",168);
        map.put("yangyin",165);
        map.put("linzhiling",178);
        System.out.println(map);

        System.out.println(map.containsKey("zhaoliying"));
        System.out.println(map.containsKey("linzhil"));
    }

    public static void show03(){
        Map<String,Integer> map = new HashMap<>();
        map.put("zhaoliying",168);
        map.put("yangyin",165);
        map.put("linzhiling",178);
        System.out.println(map);

        Integer v1 = map.get("yangying");
        System.out.println(v1);
        Integer v2 = map.get("linzhiling");
        System.out.println(v2);
    }

    public static void show02(){
        Map<String,Integer> map = new HashMap<>();
        map.put("zhaoliying",168);
        map.put("yangyin",165);
        map.put("linzhiling",178);
        System.out.println(map);

        Integer v1 = map.remove("linzhiling");
        System.out.println(v1);
        System.out.println(map);
        Integer v2 = map.remove("linzhiying");
        System.out.println(v2);
        System.out.println(map);


    }

    public static void show01(){
        HashMap<String,String> map =  new HashMap<>();
        String v1 = map.put("李晨","范冰冰1");
        System.out.println(v1);
        String v2 = map.put("李晨","范冰冰2");
        System.out.println(v2);
        System.out.println(map);
        map.put("冷锋","龙啸云");
        map.put("杨过","小龙女");
        map.put("尹志平","小龙女");
        System.out.println(map);
    }
}
