package File类与IO流.缓冲六;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\07 缓冲流\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
//        int len = 0;
//        while ((len = bis.read()) != -1){
//            System.out.println(len);
//        }
        byte[] bytes = new byte[1024];
        int len = 0;//记录每次读取的有效字节个数
        while ((len = bis.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
