package File类与IO流.File类;

import java.io.File;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类\\aaa");
        System.out.println(f1.delete());
    }

    private static void show02()  {
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println(b1);
    }

    private static void show01() throws IOException {
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println(b1);
    }
}
