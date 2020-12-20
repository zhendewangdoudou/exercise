package 两种stream流获取方式;

import java.util.stream.Stream;

public class demo06limit {
    public static void main(String[] args) {
        String[] arr = {"美洋洋","懒洋洋","喜洋洋","灰太狼"};

        Stream<String> arr1 = Stream.of(arr);
        Stream<String> str2 = arr1.limit(3);
        str2.forEach(name-> System.out.println(name));
    }
}
