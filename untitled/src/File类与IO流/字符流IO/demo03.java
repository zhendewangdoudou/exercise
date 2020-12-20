package File类与IO流.字符流IO;

import java.io.FileWriter;
import java.io.IOException;

public class demo03 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\d.txt");
        fw.write(97);
        fw.flush();
        fw.close();
    }
}
