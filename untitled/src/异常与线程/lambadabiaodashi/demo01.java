package 异常与线程.lambadabiaodashi;

public class demo01 {
    public static void main(String[] args) {
        //创建runnable接口的实现类对象
        demo01RunnableImpl run = new demo01RunnableImpl();
        //创建thread类对象 构造方法中传递Runnable接口实现类
        Thread t = new Thread(run);
        //调用start
        t.start();

        //使用匿名内部类简化代码实现多线程程序
        Runnable r =new Runnable(){
            @Override
            public void run(){
                System.out.println(Thread.currentThread().getName()+"创建了线程");
            }
        };
        new Thread(r).start();


        //继续简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了线程");
            }
        }).start();
    }
}
