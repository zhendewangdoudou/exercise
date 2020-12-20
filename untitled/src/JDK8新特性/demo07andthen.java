package JDK8新特性;

import java.util.function.Function;

public class demo07andthen {
    /*
    把String类型的123 转换为Integer 然后加10
    在转为String
     */
    /*
    转了两次 1.String-》Integer
    Function《String，Integer》 fun1
    2.Integer-》String
    FUnction《Integer，String》 fun2
    使用andThen组合
    fun1.andThen（fun2）。apply（”123“）
     */
    public static void change(String s, Function<String,Integer> fun1,Function<Integer,String> fun2){
        String ss = fun1.andThen(fun2).apply(s);
        System.out.println(ss);
    }

    public static void main(String[] args) {
        String s = "123";
        change(s,(String str)->{
            return Integer.parseInt(str)+10;
        },(Integer i)->{
            return i+"";
        });
    }
}
