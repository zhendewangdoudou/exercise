package File类与IO流.File类;

import java.io.File;

public class demo03 {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
        show04();
    }
    private static void show04(){
        File f2 = new File("a.txt");
        System.out.println(f2.length());

        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f1.length());

        File f3 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类\\1_8_1_05_File类获取功能的方法.avi");
        System.out.println(f3.length());

    }
    private static void show03(){
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f1.getName());
        File f2 = new File("a.txt");
        System.out.println(f2.getName());
    }

    private static void show02(){
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f1.getPath());
        File f2 = new File("a.txt");
        System.out.println(f2.getPath());
    }
    private static void show01(){
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f1.getAbsolutePath());
        File f2 = new File("a.txt");
        System.out.println(f2.getAbsolutePath());

    }
}
