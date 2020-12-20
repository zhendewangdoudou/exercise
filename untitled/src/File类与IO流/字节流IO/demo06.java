package File类与IO流.字节流IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo06 {
    /*
    文件复制
     数据源D:\picture\384376.jpg
     目的地：D:\xuexi\买的java\1-3-Java语言高级\06-File类与IO流\04 IO字节流

          */
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        //创建字节输入流
        FileInputStream fis = new FileInputStream("D:\\picture\\384376.jpg");
        //创建字节输出流
        FileOutputStream fos = new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\384376.jpg");


/*
        //一次读取一个字节写入一个字节的方式  次数多慢
        int len = 0;
        while ((len = fis.read()) != -1) {
            //写入
            fos.write(len);
        }

 */

//使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;//有效字节树
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //资源释放
        //先放写的
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("耗时"+(e-s)+"毫秒");
    }

}
