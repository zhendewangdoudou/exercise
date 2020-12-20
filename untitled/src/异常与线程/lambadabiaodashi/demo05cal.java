package 异常与线程.lambadabiaodashi;

public class demo05cal {
    public static void main(String[] args) {
        //调用
        invokecalc(120, 130, new demo05Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });
        //使用lambda表达式简化
        invokecalc(120,130,(int a,int b)->{
            return a+b;
        });

        invokecalc(120,130,(a,b)->a+b);
    }
    public static void invokecalc(int a,int b,demo05Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
