package File类与IO流.序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class demo01 {
    public static void main(String[] args) throws IOException {
        //1创建ObjectOutputStream对象 构造方法中传递字节输出流
        ObjectOutput oos = new ObjectOutputStream(new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\09 序列化流\\person.txt"));
        //2使用方法writeObject 把对象写入到文件中
        oos.writeObject(new demo01person("美女",18));
        //关流
        oos.close();
    }
}
