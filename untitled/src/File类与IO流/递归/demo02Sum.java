package File类与IO流.递归;

public class demo02Sum {
    public static void main(String[] args) {
        int s =  sum(3);
        System.out.println(s);
    }

    /*
    定义方法 递归计算1-n的和
    已知：最大值：n
          最小值：1
          需要明确：
          1.递归的结束条件
              获取到1的时候结束
          2.递归的目的是什么
              获取下一个被加的数字（n-1）
     */
    public static int sum(int n){
        //获取1的时候结束
        if(n == 1){
            return 1;
        }
        //获取下一个被加的数字（n-1）
        return n + sum(n-1);
    }

}
