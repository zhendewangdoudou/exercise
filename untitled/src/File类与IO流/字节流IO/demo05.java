package File类与IO流.字节流IO;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\b.txt");
//        byte[] bytes = new byte[2];
//        int len = fis.read(bytes);
//        System.out.println(len);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(new String(bytes));
//        fis.close();

        byte[] bytes = new byte[1024];
        int len = 0;//记录每次读取的有效字节个数
        while ((len = fis.read(bytes))!= -1){
            System.out.println(new java.lang.String(bytes));
            System.out.println(new java.lang.String(bytes,0,5));
        }

    }
}
