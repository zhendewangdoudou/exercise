package 异常与线程.yichang;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo06 {
    public static void main(String[] args) throws IOException {
        try {
            readfile("d:\\a.tt");
            System.out.println("资源释放");//执行不到
        }catch (IOException e){//try中抛出什么异常对象 catch就定义什么异常变量，用来接收这个异常对象
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            System.out.println("传递路径后缀不对");

        }
        System.out.println("后续代码");

       // readfile("d:\\a.txt");
    }

    public static void readfile(String fileName) throws IOException {
        //如果传递的路径不是。txt结尾抛出IO异常
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不敌");
        }

    }
}
