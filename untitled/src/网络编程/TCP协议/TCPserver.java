package 网络编程.TCP协议;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {
    /*
    服务器端
     */
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket server = new ServerSocket(8888);
        //获取客户端
        Socket socket = server.accept();
        //获取输入流
        InputStream inputStream = socket.getInputStream();
        //读
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //输出流
        OutputStream outputStream = socket.getOutputStream();

        //回写
        outputStream.write("收到 O(∩_∩)O谢谢".getBytes());
        socket.close();
        server.close();

    }
}
