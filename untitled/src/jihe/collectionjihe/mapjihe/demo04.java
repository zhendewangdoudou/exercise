package jihe.collectionjihe.mapjihe;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo04 {

    public static void main(String[] args) {
        show01();
        System.out.println("====================");
        show02();
    }
    public static void show02(){
        /*
        key:使用person类 要唯一 需要重写hashcode和equals方法
        value String类型
         */
        HashMap<demo04person,String> map = new HashMap<>();
        map.put(new demo04person("女王",18),"英国");
        map.put(new demo04person("秦始皇",18),"秦国");
        map.put(new demo04person("普京",30),"俄罗斯");
        map.put(new demo04person("女王",18),"毛里求斯");
        //使用entry  增强for
        Set<Map.Entry<demo04person, String>> set = map.entrySet();

        for (Map.Entry<demo04person, String> entry : set) {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }
    public static void show01(){
        /*
        key: String 类型
             重写了hashcode和equals方法保证key唯一
        value ：使用person类型 可以重复
                value重复 同名同年龄
         */
        HashMap<String,demo04person> map = new HashMap<>();
        //添加元素
        map.put("北京",new demo04person("张三",18));
        map.put("上海",new demo04person("李四",19));
        map.put("广州",new demo04person("王五",20));
        map.put("北京",new demo04person("赵六",18));//赵六会替换张三

        //使用keyset zengqiangfor遍历
        Set<String> set = map.keySet();
        for (String key : set) {
            demo04person value = map.get(key);
            System.out.println(key+"-->"+value);
        }

    }
}
