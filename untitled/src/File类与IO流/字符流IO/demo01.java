package File类与IO流.字符流IO;

import java.io.FileInputStream;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\a.txt");
        int len = 0;
        while ((len = fis.read())!= -1){
            System.out.println(len);
        }
        fis.close();
    }
}
