package 异常与线程.xianchengtongbujizhi;

public class demo05main {
    public static void main(String[] args) {
        demo05 run = new demo05();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //开启
        t0.start();
        t1.start();
        t2.start();
    }
}
