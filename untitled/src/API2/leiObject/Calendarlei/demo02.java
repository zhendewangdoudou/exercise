package API2.leiObject.Calendarlei;

import java.util.Calendar;

public class demo02 {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }

    public static void demo01(){
        Calendar c= Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }

    public static void demo02(){
        Calendar c= Calendar.getInstance();
        //设置年为9999年
        c.set(Calendar.YEAR,9999);
        System.out.println(c.get(Calendar.YEAR));
    }

    public static void demo03(){
        Calendar c = Calendar.getInstance();
        //把年增加两年
        c.add(Calendar.YEAR,2);
        System.out.println(c.get(Calendar.YEAR));
    }
}
