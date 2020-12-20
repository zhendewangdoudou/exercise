package File类与IO流.缓冲六;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\a.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("把数据写入内崔缓冲区".getBytes());
        bos.flush();
        bos.close();
    }
}
