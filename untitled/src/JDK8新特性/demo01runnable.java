package JDK8新特性;
/*
例如 java.lang.runnable接口就是一个函数式接口
假设有一个startThread方法使用该接口作为参数，那么就可以使用lambda进行传参
这种情况其实和thread类的构造方法参数为unnable没有本质区别
 */
public class demo01runnable {
    //定义一个方法startThread，方法的参数使用函数式接口runnable
    public static void startThread(Runnable run){
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        //调用startThread方法，方法的参数是一个接口，那么我们可以传递这个接口的匿名内部类
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"-->线程启动");
            }
        });

        //调用startThread方法，方法的参数是一个函数式接口，所以可以传递lambda表达式
        startThread(()->{
            System.out.println(Thread.currentThread().getName()+"->线程启动了");
        });

        //优化lambda表达式
        startThread(()->System.out.println(Thread.currentThread().getName()+"->线程启动了"));
    }
}
