package 异常与线程.dengdaihuanxingjizhi;

import java.util.Objects;

/*
等待唤醒案例：线程之间的通信
  创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法放弃cpu进入waiting
  创建老板线程（生产者）：花了5秒做包子 做好之后调用notify方法 唤醒顾客吃包子

 注意：顾客老板线程碧玺使用同步代码块包裹起来保证得到和唤醒只有一个在执行
 同步使用的锁对象必须保证唯一
 只有锁对象才能调用wait和notify方法
 object类中方法
 */
public class demo01WaitNotify {
    public static void main(String[] args) {
        //创建锁对象 保证唯一
        Object obj = new Object();
        //创建消费者
        new Thread(){
          @Override
          public void run(){
              //保证等待和唤醒的线程只能有一个执行 需要使用同步技术
              synchronized (obj){
                  System.out.println("包子种类和数量");
                  //调用wait 等
                  try {
                      obj.wait();
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
                  //唤醒之后执行的代码
                  System.out.println("开始吃");
              }
          }
        }.start();

        new Thread(){
            @Override
            public void run(){
                //花5秒做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("包子做好了");
                    obj.notify();
                }
            }
        }.start();
    }
}
