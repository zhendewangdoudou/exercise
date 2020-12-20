package JDK8新特性;

import java.util.function.Predicate;

/*
and 表示并且关系
例如需求 ：1 长度是否大于5
2是否包含a
 */
public class demo06and {
    /*
    定义方法 方法参数 一个字符串 来给你个predicate接口
     */
    public static boolean checkString(String s, Predicate<String> pre1,Predicate<String> pre2){
       // return pre1.test(s) && pre2.test(s);

        return pre1.and(pre2).test(s);
    }

    public static void main(String[] args) {
        String s = "angagasj";
        boolean b =checkString(s,(String str)->{
            return str.length()>5;
        },(String str)->{
            return str.contains("a");
        });
        System.out.println(b);
    }
}
