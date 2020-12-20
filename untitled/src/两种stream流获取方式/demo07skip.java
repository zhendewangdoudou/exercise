package 两种stream流获取方式;

import java.util.stream.Stream;

public class demo07skip {
    public static void main(String[] args) {
        String[] arr = {"美洋洋","懒洋洋","喜洋洋","灰太狼"};

        Stream<String> stream = Stream.of(arr);

        Stream<String> stream2 = stream.skip(3);
        stream2.forEach(name -> System.out.println(name));
    }
}
