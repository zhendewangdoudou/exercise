package File类与IO流.File类;

import java.io.File;

public class demo04 {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }
    private static void show01(){
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f1.exists());

        File f2 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01");
        System.out.println(f2.exists());
    }

    private static void show02(){
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f1.isDirectory());
    }

    private static void show03(){
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f1.isFile());
    }
}
