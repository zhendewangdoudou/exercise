package API2.leiObject.SystemLei;

import java.util.Arrays;

public class demo01 {
    public static void main(String[] args) {
        demo01();
        demo02();


    }
    public static void demo02(){
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
    public static void demo01(){
        //程序执行前获取一次毫秒值
        long start = System.currentTimeMillis();
        //执行for
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时："+(end-start)+"ms");
    }
}
