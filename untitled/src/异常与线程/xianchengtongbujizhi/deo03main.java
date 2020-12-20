package 异常与线程.xianchengtongbujizhi;

public class deo03main {
    public static void main(String[] args) {
        demo03 run = new demo03();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //开启
        t0.start();
        t1.start();
        t2.start();
    }
}
