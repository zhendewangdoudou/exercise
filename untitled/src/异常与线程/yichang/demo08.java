package 异常与线程.yichang;

import java.util.ArrayList;
import java.util.List;

public class demo08 {
    public static void main(String[] args) {

        try{
            int[] arr = {1,2,3};
            System.out.println(arr[3]);//越界
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }



    }
}
