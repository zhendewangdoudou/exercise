package File类与IO流.字符流IO;

import java.io.FileWriter;
import java.io.IOException;

public class demo06 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
             fw = new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\g.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("Hello word"+i);
            }

            for (int i = 0; i < 10; i++) {
                fw.write("Hello word a"+i+"\r\n");
            }

        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(fw != null){
                try {
                    //方法声明跑出了IOException异常对象 应该处理异常对象要么throws要么trycatch
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
