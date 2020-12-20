package File类与IO流.字符流IO;

import java.io.FileWriter;
import java.io.IOException;

public class demo04 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\e.txt");
        char[] cs = {'a','b','c','d','e'};
        //void writer(char[] cbuf)
        fw.write(cs);
        //void write(char[]cbuf,int off,int len
        fw.write(cs,1,3);//bcd

        fw.write("传智播客");

        fw.write("黑马程序员",2,3);



        fw.close();
    }
}
