package File类与IO流.字节流IO;

import java.io.FileInputStream;
import java.io.IOException;

public class demo04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\a.txt");
        int len = 0;//记录读取到的字节

        while ((len = fis.read()) != -1){
            System.out.println(len);
        }

        //System.out.println(len);
        fis.close();
    }
}
