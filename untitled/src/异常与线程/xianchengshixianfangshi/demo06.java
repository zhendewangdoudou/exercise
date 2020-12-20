package 异常与线程.xianchengshixianfangshi;

import sun.awt.windows.ThemeReader;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.TransferQueue;

public class demo06 {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i <= 60; i++) {
            System.out.println(i);


            //使用thread类的sleep方法让程序睡眠1秒钟
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
