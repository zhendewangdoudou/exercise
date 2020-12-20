package 异常与线程.xianchengshixianfangshi;

public class demo05MyThread extends Thread{

    public demo05MyThread(){

    }
    public demo05MyThread(String name){
        super(name);
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
