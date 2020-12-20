package 异常与线程.xianchengtongbujizhi;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class  demo05 implements Runnable {
    //定义一个多个线程共享的票源
    private static int ticket = 100;

    //创建对象
    Lock l = new ReentrantLock();



    @Override
    public void run() {
        //卖票
        //使用循环，重复
        while (true) {
            //锁上
            l.lock();
            if (ticket > 0) {
                //提高安全问题出现的概率,让程序睡眠一下
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //存在卖票
                System.out.println(Thread.currentThread().getName() + "->正在卖" + ticket + "票");
                ticket--;
            }
            //释放
            l.unlock();
        }

    }

}
