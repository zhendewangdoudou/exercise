package File类与IO流.缓冲六;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class demo04 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲流输出对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\c.txt"));
        //调用write方法
        for (int i = 0; i < 10; i++) {
            bw.write("传智播客");
           // bw.write("\r\n");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
