package 两种stream流获取方式;

import java.util.stream.Stream;

public class demo03 {
    //foreach
    public static void main(String[] args) {
        //获取
        Stream<String> stream = Stream.of("张三封", "李四", "张无忌", "赵六","张翠山");
        //过滤
       // stream.forEach((String name)->{
         //   System.out.println(name);
        //});
        Stream<String> str2 = stream.filter((String name)->{
            return name.startsWith("张");
        });
        str2.forEach((String name)->{
            System.out.println(name);
        });
    }
}
