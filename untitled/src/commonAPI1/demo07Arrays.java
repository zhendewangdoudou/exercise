package commonAPI1;

import java.util.Arrays;

public class demo07Arrays {
    public static void main(String[] args) {
        int[] intArray = {10,20,30};
        String intStr = Arrays.toString(intArray);
        System.out.println(intStr);

        int[] array1 = {2,1,3,10,6};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        //练习
        String str= "sjdiajfiejaccncao";
        //升序排列 sort 但必须是个数组 toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        //倒序遍历
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}
