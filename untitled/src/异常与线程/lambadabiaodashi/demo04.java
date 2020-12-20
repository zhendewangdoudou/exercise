package 异常与线程.lambadabiaodashi;

import java.util.Arrays;
import java.util.Comparator;

public class demo04 {
    public static void main(String[] args) {
        demo04person[] arr = {
                new demo04person("柳",38),
                new demo04person("迪丽",18),
                new demo04person("古力",19)
        };
//        //对数组中的对象进行排序
//        Arrays.sort(arr,new Comparator<demo04person>(){
//
//            @Override
//            public int compare(demo04person o1, demo04person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });


        //使用lambda简化
        Arrays.sort(arr,(demo04person o1, demo04person o2)->{
            return o1.getAge()-o2.getAge();
        });

        Arrays.sort(arr,(o1,o2)->o1.getAge()-o2.getAge());

        //遍历数组
        for (demo04person demo04person : arr) {
            System.out.println(demo04person);

        }
    }
}
