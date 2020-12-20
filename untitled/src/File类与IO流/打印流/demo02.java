package File类与IO流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class demo02 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("我是在控制台输出");

        PrintStream ps = new PrintStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\07-网络编程\\第2节 TCP协议\\目的地是打印流.txt");
        System.setOut(ps);//把输出语句的目的地改编为打印流的目的地
        System.out.println("我在打印流的目的地中输出");
        ps.close();
    }
}
