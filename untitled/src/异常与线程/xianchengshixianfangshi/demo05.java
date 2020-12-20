package 异常与线程.xianchengshixianfangshi;

public class demo05 {
    public static void main(String[] args) {
        demo05MyThread mt= new demo05MyThread();
        mt.setName("小强");
        mt.start();

        new demo05MyThread("wangwang").start();

    }
}
