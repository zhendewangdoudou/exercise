package API2.leiObject.Datalei;

import java.util.Date;

public class demo02 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    public static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
    public static void demo02(){
        Date date = new Date(0L);
        System.out.println(date);
    }
}
