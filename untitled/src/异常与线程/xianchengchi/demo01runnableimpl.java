package 异常与线程.xianchengchi;

public class demo01runnableimpl implements Runnable{
//设置线程任务
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
