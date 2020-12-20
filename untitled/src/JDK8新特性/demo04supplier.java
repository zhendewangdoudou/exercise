package JDK8新特性;

import java.util.function.Supplier;

public class demo04supplier {
    //定义方法 方法参数传递supplier<T>接口，泛型执行string get返回一个string
    public static String getString(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        //调用getString方法 方法的参数Supplier是一个函数式接口 所以可以传递lambda表达式
        String s = getString(()->{
            //生产一个字符串并返回
            return "huge";
        });
        System.out.println(s);

        //优化 ： 调用getString方法 方法的参数Supplier是一个函数式接口 所以可以传递lambda表达式
        String s1 = getString(()-> "huge");
        System.out.println(s1);
    }
}
