package commonAPI1;

import java.util.Scanner;

public class demo02niming2 {
    public static void main(String[] args) {

        //普通方式
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入的是"+num);

        //匿名对象的方式
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("输入的是"+num1);

        //使用一般方法传入参数
        Scanner sc1 = new Scanner(System.in);
        methodParam(sc1);

        //使用匿名方法来传参
        methodParam(new Scanner(System.in));

        Scanner sc2 = methodReturn();
        int num2 = sc.nextInt();
        System.out.println("输入的是"+num2);

    }

    public static Scanner methodReturn(){
        //正常
//        Scanner sc = new Scanner(System.in);
////        return sc;
////
        //匿名对线
        return new Scanner(System.in);
    }
    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是"+ num);
    }
}
