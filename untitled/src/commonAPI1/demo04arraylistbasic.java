package commonAPI1;

import java.util.ArrayList;

public class demo04arraylistbasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();

        //泛型只能是引用类型 不能是基本类型
        ArrayList<Integer> listC = new ArrayList<>();

        listC.add(100);
        listC.add(200);
        System.out.println(listC);

        int num = listC.get(1);
        System.out.println(num);
    }
}
