package jihe.collectionjihe.mapjihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class demo03entrybianli {
    public static void main(String[] args) {
        /*
        Set<map.Entry<K,V>> entrySet()
        实现步骤：
           1.使用Map集合中的方法entrySet(),把map集合中多个entry对象取出来，存储到一个set集合中
           2.遍历set集合，获取每一个entry对象
           3.使用entry对象中的方法getkey（）和getvalue
         */
        Map<String,Integer> map = new HashMap<>();
        map.put("zhaoliying",168);
        map.put("yangyin",165);
        map.put("linzhiling",178);
        System.out.println(map);

        //1
        Set<Map.Entry<String, Integer>> set = map.entrySet();
        //2
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"="+value);
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : set) {
            System.out.println(stringIntegerEntry.getKey()+"="+stringIntegerEntry.getValue());
        }


    }
}
