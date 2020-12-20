package 两种stream流获取方式;

import java.util.stream.Stream;

public class demo02 {
    //foreach
    public static void main(String[] args) {
        //获取
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六");
        //遍历
        stream.forEach((String name)->{
            System.out.println(name);
        });
    }
}
