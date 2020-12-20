package commonAPI1;

import java.util.Random;

public class Demo03random {

    public static void main(String[] args) {
        Random r = new Random();

        //获取随机数字 在所有范围 由正负两种
        int num = r.nextInt();
        System.out.println("随机数"+num);

        //获取随机数字  循环 在10范围
        for(int i = 0;i < 100;i++){
            int num1 = r.nextInt(10);
            System.out.println(num1);
        }


        //获取数字范围为【1，n】
        int n = 5;
        for (int j= 0; j < 100; j++) {
            int result = r.nextInt(n)+1;//整体加1
            System.out.println(result);
        }

    }
}
