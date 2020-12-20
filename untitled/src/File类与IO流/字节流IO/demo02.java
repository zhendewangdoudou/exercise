package File类与IO流.字节流IO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class demo02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("D:\\xuexi\\买的java\\1-3-Java语言高级\\06-File类与IO流\\04 IO字节流\\b.txt"));
        fos.write(49);
        fos.write(48);
        fos.write(48);
        //fos.close();

        byte[] bytes = {65,66,67,68,69};
        fos.write(bytes);
        byte[] bytes1 = {-65,-66,-67,68,69};
        fos.write(bytes1);

        //把字节数组一部分写入到文件
        //write(byte[] b,int off,int len):字节数组 开始索引 查毒
        fos.write(bytes,1,2);

        //写入字符串方法 可以使用String 类中方法
        //转为字节数组 byte[] getBytes（）
        byte[] bytes2 = "你好".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);
        fos.close();
    }
}
