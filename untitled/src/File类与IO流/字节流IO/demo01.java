package File类与IO流.字节流IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\a.txt");
        fos.write(97);//void write(int b)
        fos.close();
    }
}
