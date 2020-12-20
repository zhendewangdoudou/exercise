package 异常与线程.xianchengshixianfangshi;

//1.创建一个thread类的子类
public class demo02Mythread extends Thread{
    //重写run方法 设置线程任务
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("rub"+i);
        }
    }
}
