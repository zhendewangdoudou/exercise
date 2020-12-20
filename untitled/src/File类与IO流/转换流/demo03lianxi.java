package File类与IO流.转换流;

import java.io.*;

public class demo03lianxi {
    /*
    练习：转换文件编码
      将GBK编码的文本文件 转换为utf-8编码的文本文件

    分析：
      1.创建InputStreamReader对象构建方法中传递字节输入流和指定编码表名称
      2.创建OutputStreamWriter对象构建方法中传递字节输入流和指定编码表名称
      3.使用read方法读文件
      4.使用write犯法写到文件中
      5.。释放资源
     */
    public static void main(String[] args) throws IOException {
//        1.创建InputStreamReader对象构建方法中传递字节输入流和指定编码表名称
        InputStreamReader isr  = new InputStreamReader(new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\我是jbk.txt"),"GBK");
//        2.创建OutputStreamWriter对象构建方法中传递字节输入流和指定编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\转换后utf.txt"),"UTF-8");
//        3.使用read方法读文件
        int len = 0;
        while ((len = isr.read())!= -1){
            osw.write(len);
        }
//        4.使用write犯法写到文件中
//        5.。释放资源
        osw.close();
        isr.close();
    }
}
