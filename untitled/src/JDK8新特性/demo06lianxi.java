package JDK8新特性;

import java.util.ArrayList;
import java.util.function.Predicate;

public class demo06lianxi {
    /*
    数组当中由多条“姓名+性别”的信息如下，请通过predicate接口的拼装将符合要求的字符串筛选到集合arrayList中，满足两个条件
    1.必须为女生
    2.姓名为四个字
     */
    /*
    分析：
    1.有两个判断条件 所以需要使用另个predicate接口
    2.必须满足两个条件 and连接
     */
    /*
    定义方法

     */
    public static ArrayList<String> filter(String[] arr, Predicate<String> pre1,Predicate<String> pre2){
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pre1.and(pre2).test(s);
            if(b){
                //条件都满足 窜出
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女","古力娜扎,女","马儿扎哈,男","赵丽颖,女"};

        //调用方法
        ArrayList<String> list = filter(array,(String s)->{
            //获取性别
            return s.split(",")[1].equals("女");
        },(String s)->{
            return s.split(",")[0].length()==4;
        });

        for (String s : list) {
            System.out.println(s);
        }

    }
}
