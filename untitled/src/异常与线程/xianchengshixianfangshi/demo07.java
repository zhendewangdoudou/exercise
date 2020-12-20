package 异常与线程.xianchengshixianfangshi;

public class demo07 {
    public static void main(String[] args) {
        //创建对象
        demo07runnableImpl run = new demo07runnableImpl();
        //创建对象
        Thread t = new Thread(run);
        //开启线程
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
