package 异常与线程.yichang;

import java.io.FileNotFoundException;
import java.io.IOException;

public class demo05 {
    public static void main(String[] args) throws IOException {
        readfile("d:\\a.txt");
    }

    public static void readfile(String fileName) throws IOException {
        //如果传递的路径不是。txt结尾抛出IO异常
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不敌");
        }
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的路径不对");
        }
    }
}
