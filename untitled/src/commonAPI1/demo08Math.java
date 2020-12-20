package commonAPI1;

public class demo08Math {
    public static void main(String[] args) {
        //获取绝对值
        System.out.println(Math.abs(3.14));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-2.5));
        System.out.println("==================");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));

        //向下取整
        System.out.println(Math.floor(30.1));
        System.out.println(Math.floor(30.9));

        //round
        System.out.println(Math.round(20.4));
        System.out.println(Math.round(10.5));


        //练习
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        //这样处理变量i就是区间之内所有的整数
        for(int i = (int)min;i<max;i++){
            int abs = Math.abs(i);
            if(abs > 6 || abs<2.1){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
