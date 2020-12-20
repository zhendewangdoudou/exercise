package File类与IO流.Properties集合;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class demo02 {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用set添加数据
        prop.setProperty("zhoa","168");
        prop.setProperty("dili","165");
        prop.setProperty("guli","160");
        //创建字符流
        //FileWriter fw = new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\06 Properties集合\\a.txt");

        //写
       // prop.store(fw,"save data");
        prop.store(new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\06 Properties集合\\b.txt"),"");
        //关流
        //fw.close();

    }
}
