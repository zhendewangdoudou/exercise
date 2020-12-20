package 两种stream流获取方式;

import java.util.stream.Stream;

public class demo08concat {
    public static void main(String[] args) {
        String[] arr = {"美洋洋","懒洋洋","喜洋洋","灰太狼"};
        Stream<String> stream = Stream.of("张三封", "李四", "张无忌", "赵六","张翠山");
        Stream<String> stream2 = Stream.of(arr);

        Stream<String> concat = Stream.concat(stream, stream2);
        concat.forEach(name-> System.out.println(name));

    }
}
