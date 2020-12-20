package File类与IO流.字符流IO;

import java.io.FileWriter;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\g.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("Hello word"+i);
        }

        for (int i = 0; i < 10; i++) {
            fw.write("Hello word a"+i+"\r\n");
        }
        fw.close();
    }
}
