package File类与IO流.File类;

import java.io.File;

public class demo02 {
    public static void main(String[] args) {
        show01();
        show02("c:","a.txt");
        show03();
    }
    private static void show03(){
        File parent = new File("c:\\");
        File file = new File(parent,"hello.java");
        System.out.println(file);
    }
    private static void show02(String parent,String child){
        //File(String parent,String child)
        File file = new File(parent,child);
        System.out.println(file);
    }
    private static void show01(){
        File f1 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类\\a.txt");
        System.out.println(f1);//重写了object的toString

        File f2 = new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\01 File类");
        System.out.println(f2);//重写了object的toString

        File f3 = new File("a.txt");
        System.out.println(f3);//重写了object的toString
    }
}
