package File类与IO流.序列化流;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class demo03lianxi {
    /*
    序列化集合  当我们想在文件中保存多个对象的时候 可以把多个对象存储到一个集合中 对集合进行序列化和反序列化

    分析：
     1定义一个存储person对象的arraylist集合
     2往Arraylist集合中存储person
     3创建一个序列化流ObjectOutputStream对象
     4使用ObjectOutputStream对象中的方法writeObject，对集合进行序列化
     5.反序列化对象
     6使用ObjectInputStream对象readObject方法读取文件中
     7.把object类型的集合转换为arraylist类型
     8.遍历集合
     9.关流

     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<demo01person> list = new ArrayList<>();
        list.add(new demo01person("zh",18));
        list.add(new demo01person("li",19));
        list.add(new demo01person("wang",20));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\09 序列化流\\list.txt"));
        oos.writeObject(list);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\09 序列化流\\list.txt"));
        Object o = ois.readObject();
        ArrayList<demo01person> list2 = (ArrayList<demo01person>)o;
        for (demo01person person : list2) {
            System.out.println(person);
        }
        ois.close();
        oos.close();
    }
}
