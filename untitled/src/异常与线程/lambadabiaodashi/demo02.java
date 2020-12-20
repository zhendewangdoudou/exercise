package 异常与线程.lambadabiaodashi;

import sun.awt.windows.ThemeReader;

public class demo02 {
    public static void main(String[] args) {

        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"创建了线程");
            }
        }).start();
        //使用Lambda表达式是新啊多线程
        new Thread(()-> {

                System.out.println(Thread.currentThread().getName()+"创建了线程");
        }
        ).start();

        //省略简化
        new Thread(()->System.out.println(Thread.currentThread().getName()+"创建了线程")).start();
    }
}
