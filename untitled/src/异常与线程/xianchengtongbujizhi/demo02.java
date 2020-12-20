package 异常与线程.xianchengtongbujizhi;

public class demo02 implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;
    @Override
    public void run() {
        //卖票
        //使用循环，重复
        while(true){
            //提高安全问题出现的概率,让程序睡眠一下
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //先判断存在
            if (ticket >0){
                //存在卖票
                System.out.println(Thread.currentThread().getName()+"->正在卖"+ticket+"票");
                ticket--;
            }
        }
    }
}
