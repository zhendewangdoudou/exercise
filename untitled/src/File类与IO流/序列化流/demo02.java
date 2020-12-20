package File类与IO流.序列化流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class demo02 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\09 序列化流\\person.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);

        //强转
        demo01person p = (demo01person)o;
        System.out.println(p);
    }
}
