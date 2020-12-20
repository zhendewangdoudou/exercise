package File类与IO流.转换流;

import java.io.*;

public class demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        //1.创建OutputStreamWriter对象 构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\gbk.txt"),"GBK");
        //2.使用OutputStream 对象中的方法write 吧字符转换为字节村好处缓冲区中（编码
        osw.write("你好");
        //3.使用OutputStream对象中的方法flush吧内存缓冲区中的字节刷新到文件中
        osw.flush();
        //关流
        osw.close();
    }

    private static void write_utf_8() throws IOException {
        //1.创建OutputStreamWriter对象 构造方法中传递字节输出流和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\utf8.txt"));
        //2.使用OutputStream 对象中的方法write 吧字符转换为字节村好处缓冲区中（编码
        osw.write("你好");
        //3.使用OutputStream对象中的方法flush吧内存缓冲区中的字节刷新到文件中
        osw.flush();
        //关流
        osw.close();
    }

}
