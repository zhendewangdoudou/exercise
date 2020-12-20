package JDK8新特性;

import java.util.function.Function;

public class demo07function {
    /*
    定义一个方法 方法参数传递一个字符串类型的整数 方法的参数传递一个function接口
    泛型《String，Integer》
     */
    public static void change(String s, Function<String,Integer> fun){
        Integer in = fun.apply(s);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String s = "1234";
        change(s,(String str)->{
            return Integer.parseInt(str);
        });
    }

}
