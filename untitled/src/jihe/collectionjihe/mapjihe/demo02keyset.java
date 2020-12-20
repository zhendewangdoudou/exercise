package jihe.collectionjihe.mapjihe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//keyset 遍历map 键找值
public class demo02keyset {
    public static void main(String[] args) {
        /*
        1Map集合中方法keyset（）把map集合中所有的键取出 存储到set中
        2遍历set集合获取map集合中的每一个key
        3通过map集合中的方法get（key）找到value
         */
        Map<String,Integer> map = new HashMap<>();
        map.put("zhaoliying",168);
        map.put("yangyin",165);
        map.put("linzhiling",178);
        System.out.println(map);

        //1
        Set<String> set = map.keySet();
        //2
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            //3
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        for (String s : set) {
            Integer value =map.get(s);
            System.out.println(s+value);
        }

    }
}
