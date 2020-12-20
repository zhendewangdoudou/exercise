package 异常与线程.xianchengshixianfangshi;

public class demo04Mythread extends Thread {
    @Override
    public void run(){
        //获取线程名称
//        String name = getName();
//        System.out.println(name);

        //方法2
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
