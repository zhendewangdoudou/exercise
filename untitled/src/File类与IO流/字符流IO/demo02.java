package File类与IO流.字符流IO;

import java.io.FileReader;
import java.io.IOException;

public class demo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\a.txt");
//        int len = 0;
//        while ((len = fr.read())!= -1){
//            System.out.println(len);
//            System.out.println((char)len);
//        }

        //读取多个字符
        char[] cs = new char[1024];
        int len = 0;//有效字符个数
        while ((len = fr.read(cs))!=-1){
            System.out.println(new String(cs,0,len));
        }
        fr.close();
    }
}
