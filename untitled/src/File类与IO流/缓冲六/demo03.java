package File类与IO流.缓冲六;

import java.io.*;

public class demo03 {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();

        //创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\picture\\1.jpg"));

        //创建字节缓冲流输出对象 构造方法，传递字节输出流
        BufferedOutputStream  bos = new BufferedOutputStream(new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\1.jpg"));
        //read读取文件
        //一次读取一个字节写入一个字节的方式
//        int len = 0;
//        while ((len = bis.read())!= -1){
//            bos.write(len);
//        }

        //创建数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }

//        int len = 0;
//        while ((len = bis.read())!= -1){
//            bos.write(len);
//        }

        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时："+(e-s) + "毫秒");
    }
}
