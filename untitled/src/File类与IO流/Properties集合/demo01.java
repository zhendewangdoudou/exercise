package File类与IO流.Properties集合;

import javafx.scene.layout.Priority;

import java.util.Properties;
import java.util.Set;

public class demo01 {
    public static void main(String[] args) {
        show01();
    }
/*
使用properties集合存储数据，遍历集合中的数据
集合是一个双列集合 key和value默认是字符串

 */
    private static void show01() {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用set添加数据
        prop.setProperty("zhoa","168");
        prop.setProperty("dili","165");
        prop.setProperty("guli","160");
        //使用StringPropertyNames把Properties集合中的键取出，存储到一个set集合中
        Set<String> set = prop.stringPropertyNames();
        //遍历set集合 取出每一个键
        for (String key : set) {
            //使用getProperties方法通过key获取value
            System.out.println(prop.getProperty(key));

        }
    }
}
