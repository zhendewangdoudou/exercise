package File类与IO流.File类;

import java.io.File;

public class demo06 {
    public static void main(String[] args) {
        //show1();
        show2();

    }

    private static void show2() {
        File f1 =new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }

    private static void show1() {
        File f1 =new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        String[] arr = f1.list();
        for (String s : arr) {
            System.out.println(s);
        }


        File f2 =new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类\\1.txt");
        String[] arr2 = f2.list();
        for (String s : arr2) {
            System.out.println(s);
        }
    }
}
