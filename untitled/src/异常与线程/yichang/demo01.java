package 异常与线程.yichang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo01 {

    public static void main(String[] args) /*throws ParseException */{
        /*


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try{
             date = sdf.parse("1999-09-09");
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println(date);
         */
        int[] arr = {1,2,3};
        try{
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
