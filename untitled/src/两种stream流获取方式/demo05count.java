package 两种stream流获取方式;

import java.util.ArrayList;
import java.util.stream.Stream;

public class demo05count {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
