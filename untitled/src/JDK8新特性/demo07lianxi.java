package JDK8新特性;

import java.util.function.Function;

/*
自定义函数模型拼接
使用function
String str = “赵丽颖 ，20”；
1.将字符串截取数字年龄部分，得到字符串
  function《String ，String》
2.将上一步的字符串转换成为int类型数字
  function 《String，Integer》
3.将上一步的int数字累加100，得到结果int数字
function《Integer，Integer》20-》120
 */
public class demo07lianxi {
    public static int change(String s, Function<String,String> fun1,Function<String,Integer> fun2,Function<Integer,Integer> fun3){
       return fun1.andThen(fun2).andThen(fun3).apply(s);
    }

    public static void main(String[] args) {
        String str = "赵丽颖，20";
        int num = change(str,(String s)->{
            return s.split("，")[1];
        },(String s)->{
            return Integer.parseInt(s);
        },(Integer i)->{
            return i+100;
        });

        System.out.println(num);
    }
}
