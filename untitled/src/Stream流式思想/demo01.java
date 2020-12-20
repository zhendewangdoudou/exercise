package Stream流式思想;

import java.util.ArrayList;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //以张开头的 过滤
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                listA.add(s);
            }
        }

        //长度为3的过滤
        List<String> listB  = new ArrayList<>();
        for (String s : listA) {
            if(s.length() == 3){
                listB.add(s);
            }
        }
        //遍历
        for (String s : listB) {
            System.out.println(s);
        }
    }
}
