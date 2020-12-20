package 两种stream流获取方式;

import java.util.stream.Stream;

public class demo04map {
    public static void main(String[] args) {
        //获取streeam类型流
        Stream<String> stream = Stream.of("1","2","3","4");
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        stream2.forEach(i-> System.out.println(i));
    }

}
