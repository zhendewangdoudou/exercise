package File类与IO流.Properties集合;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class demo03 {
    public static void main(String[] args) throws IOException {
        show();
    }

    private static void show() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\06 Properties集合\\a.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+prop.getProperty(key));
        }
    }
}
