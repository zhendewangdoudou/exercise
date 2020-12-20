package jihe.collectionjihe.collectionjihee;

import java.util.ArrayList;
import java.util.Arrays;

public class demo03foreach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,};
        for(int i:arr){
            System.out.print(i);
        }
        System.out.println();
        ArrayList<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbbb");
        list.add("vvvv");
        for(String s :list){
            System.out.print(s);
        }
    }
}
