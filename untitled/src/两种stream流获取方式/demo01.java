package 两种stream流获取方式;

import java.util.*;
import java.util.stream.Stream;

public class demo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> str1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> str2 = set.stream();

        Stream<Integer> str = Stream.of(1, 2, 3, 4, 5);
    }
}
