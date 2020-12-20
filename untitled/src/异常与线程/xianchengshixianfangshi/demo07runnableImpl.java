package 异常与线程.xianchengshixianfangshi;
//创建runnable接口实现类
public class demo07runnableImpl implements Runnable{
    //在实现类中重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"->"+i);
        }
    }
}
