package 网络编程.TCP协议;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPclient {
    //tcp通信客户端：向服务器发送连接请求 给服务器发送数据读服务器会写数据
     //表示客户端的类
    /*
    java。net。socket
    套接字
    构造方法
     socket（String host，int port）
     */
    public static void main(String[] args) throws IOException {
        //创建客户端socket对象
        Socket socket = new Socket("127.0.0.1",8888);
        //使用socket中的getoutputStream获取网络中字节输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //流中方法write
        outputStream.write("你好服务器".getBytes());


        //使用socket中的getInputStream 获取字节输入流
        InputStream inputStream = socket.getInputStream();
        //read
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));

        //关闭
        socket.close();
    }
}
