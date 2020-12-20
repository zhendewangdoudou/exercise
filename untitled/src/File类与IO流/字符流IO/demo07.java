package File类与IO流.字符流IO;

import java.io.FileWriter;
import java.io.IOException;
//JDK7
public class demo07 {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\05 IO字符流\\h.txt");){

            for (int i = 0; i < 10; i++) {
                fw.write("Hello word"+i);
            }


        }catch (IOException e){
            System.out.println(e);
        }
    }
}
