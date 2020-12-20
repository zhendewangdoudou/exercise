package File类与IO流.缓冲六;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象，构造方法中传递字符输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\a.txt"));

        //使用字符缓冲输入流对象中方法read readLine读文本
//        String line = br.readLine();
//        System.out.println(line);

        //很多行
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        //释放资源
        br.close();
    }
}
