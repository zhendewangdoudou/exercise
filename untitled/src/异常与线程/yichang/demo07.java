package 异常与线程.yichang;

import java.io.IOException;

public class demo07 {
    public static void main(String[] args) {
        try {
            readfile("c:");
        } catch (IOException e) {
            //异常处理逻辑
            e.printStackTrace();
        }finally {
            //一定执行
            System.out.println("资源释放");
        }

    }
    public static void readfile(String fileName) throws IOException {
        //如果传递的路径不是。txt结尾抛出IO异常
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不敌");
        }

    }
}
