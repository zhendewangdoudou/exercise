package 异常与线程.xianchengshixianfangshi;

//匿名内部类实现线程的创建
//作用简化代码
//吧子类继承父类 重写父类方法 创建子类对象合成一部完成
//吧实现类试下接口 重写接口中的方法 创建实现类对象合成一步完成
public class demo09 {
    public static void main(String[] args) {

        //线程的父类是Tread
        //new MyThread().start();
        new Thread(){
            //重写run方法设置任务
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+i);
                }
            }
        }.start();

        //接口
        //runnable r = new runnableImp();
       Runnable r = new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+"程序"+i);
                }
            }
        };
        new Thread(r).start();

        //简化接口方式
        new Thread(new Runnable(){
            @Override
            public void run(){
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"->"+"程序2"+i);
                }
            }
        }).start();
    }

}
