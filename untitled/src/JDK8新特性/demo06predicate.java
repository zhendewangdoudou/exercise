package JDK8新特性;

import java.util.function.Predicate;

public class demo06predicate {
    /*
    定义一个方法 参数传递一个String类型的字符串
    传递一个predicate接口  泛型String
    方法test对字符串进行panduan
     */
    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }

    public static void main(String[] args) {
        //dingyizifuchuan
        String s = "abcda";
        //调用方法 参数传递字符串和lamabda表达式
        boolean b = checkString(s,(String str)->{
            //判断长度是否大于5
            return str.length()>5;
        });


        //优化
        boolean b1 = checkString(s, str->
            //判断长度是否大于5
             str.length()>5
        );
        System.out.println(b);
    }
}
