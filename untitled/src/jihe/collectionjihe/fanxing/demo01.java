package jihe.collectionjihe.fanxing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class demo01 {
    public static void main(String[] args) {
        show01();
show02();
    }

    public static void show02(){
        ArrayList<String> list = new ArrayList<>();

    }

    public static void show01(){
        ArrayList list = new ArrayList();//不写《》类型就是object
        list.add("abc");
        list.add(1);
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String类特有的方法，length获取字符串长度，不能使用 多态Object obj = ”abc“
            String s= (String)obj;//抛出classcastexception类型转换异常
            System.out.println(s.length());
        }

    }
}
