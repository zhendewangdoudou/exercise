package 方法引用;

public class demp04staticreference {
    //定义方法 参数 传递要计算绝对值的着呢个数
    public static int method(int number,demo4calcable c){
        return c.calsAbs(number);
    }

    public static void main(String[] args) {
        int number = method(-10,(num)->{
            return Math.abs(num);
        });
        System.out.println(number);

        /*
        使用方法引用 优化
        math类 存在
        abs存在
         */
        int num2 = method(-10,Math::abs);
        System.out.println(num2);
    }
}
