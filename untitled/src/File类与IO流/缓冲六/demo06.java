package File类与IO流.缓冲六;

import java.io.*;
import java.util.HashMap;

/*
对文本内容排序
 */
public class demo06 {
    public static void main(String[] args) throws IOException {
        //创建hashmap存储序号和内容
        HashMap<String,String> map = new HashMap<>();

        //创建字符缓冲输入流对象，构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\in.txt"));

        //创建字符缓冲输出流对象，构造方法中绑定字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\08 转换流\\out.txt"));

        //使用字符缓冲输入流中的方法readLine逐行读取文本
        String line;
        while((line = br.readLine()) != null){
            String[] arr = line.split("\\.");
            map.put(arr[0],arr[1]);
        }

        //遍历集合，获取每个键值对
        for(String key:map.keySet()){
            String value = map.get(key);
            line = key+"."+value;
            bw.write(line);
            bw.newLine();//换行
        }
        //关闭资源
        bw.close();
        br.close();
    }
}
