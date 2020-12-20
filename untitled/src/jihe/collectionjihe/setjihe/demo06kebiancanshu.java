package jihe.collectionjihe.setjihe;

public class demo06kebiancanshu {
    public static void main(String[] args) {
        int i = add();
        int i1 = add(10,20);
        System.out.println(i);
        System.out.println(i1);

    }
    //定义一个方法计算两个整数和
//    public static int add(int a,int b){
//        return a+b;
//    }
    //定义计算一个方法 计算0-n个整数的和的方法
    //已经确定整数类型  但是不知道要计算几个整数的和,就可以使用可变参数
    public static int add(int...arr){
//        System.out.println(arr);
//        System.out.println(arr.length);
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

}
