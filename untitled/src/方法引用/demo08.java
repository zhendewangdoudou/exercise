package 方法引用;

public class demo08 {
/*
方法参数传递创建数组长度和arraybuilder接口

 */
public static int[] createArray(int length,demo08arrbuilder ab){
    return ab.builderarr(length);
}

    public static void main(String[] args) {
        int[] arr1 = createArray(10,(len)->{
            return new int[len];
        });
        System.out.println(arr1.length);

        /*
        长度已知
        int【】已知
         */
        int[] arr2 = createArray(10,int[]::new);
        System.out.println(arr2.length);
    }
}
