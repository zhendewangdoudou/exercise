/*
客户端 读取本地文件 上传服务器 读取服务器回写数据

数据源：D:\picture\1.jpg
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\xuexi\\买的java\\1\\1.jpg");

        //2socket对象
        Socket socket = new Socket("127.0.0.1",8888);

        //3获取网络字节输出流
        OutputStream os = socket.getOutputStream();

        //4.读本地
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!= -1){
            //写
            os.write(bytes,0,len);
        }
        //6获取
        InputStream is = socket.getInputStream();

        while ((len = is.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }

        //8释放
        fis.close();
        socket.close();


    }
}
