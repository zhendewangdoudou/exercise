package File类与IO流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\07-网络编程\\第2节 TCP协议\\print.txt");
        ps.write(97);
        ps.println(97);
        ps.println(8.8);
        ps.println('a');
        ps.println("helloworld");
        ps.println(true);
        ps.close();



    }
}
