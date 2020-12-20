package File类与IO流.转换流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo2InputStream {
    public static void main(String[] args) throws IOException {
        read_utf();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        //1。创建InputStreamReader对象 构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\gbk.txt"),"GBK");
        //2.使用方法read读文件
        int len = 0;
        while((len = isr.read())!= -1){
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void read_utf() throws IOException {
        //1。创建InputStreamReader对象 构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\utf8.txt"));
        //2.使用方法read读文件
        int len = 0;
        while((len = isr.read())!= -1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
