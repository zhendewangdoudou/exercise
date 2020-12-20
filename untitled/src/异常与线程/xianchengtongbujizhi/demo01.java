package 异常与线程.xianchengtongbujizhi;
//模拟卖票案例
//3个线程 同时开启 对共享票进行出售
public class demo01 {
    public static void main(String[] args) {
        //创建接口实现类 1个实现类
        demo01runnable run = new demo01runnable();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //开启
        t0.start();
        t1.start();
        t2.start();
    }
}
