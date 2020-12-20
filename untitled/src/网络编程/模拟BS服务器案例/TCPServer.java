package 网络编程.模拟BS服务器案例;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器 和系统指定端号
        ServerSocket server = new ServerSocket(8080);
        //使用accept方法
        Socket socket = server.accept();
        //使用getInputStream获取网络字节输入流
        InputStream is = socket.getInputStream();
        /*

       x
        //使用网络字节输入流对象 read
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = is.read(bytes))!= -1){
            System.out.println(new String(bytes,0,len));
        }

          */
         //吧is网络字节输入流对象转换为字符输入缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //读一行
        String line = br.readLine();
        //切割 只要中间的地方
        String[] arr = line.split(" ");
        //吧路径前面的/去掉 进行截取
        String htmlpath = arr[1].substring(1);

        //创建本地字节输入流 构造方法中绑定要读取的html路径
        FileInputStream fis = new FileInputStream(htmlpath);

        //使用socket中的getoutStream获取网络字节输出流outputStream
        OutputStream os = socket.getOutputStream();
        //写入http协议响应头固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content - Type:text/html\r\n".getBytes());
        //必须要写入空行 否则浏览器不解析
        os.write("\r\n".getBytes());

        //一读一写 复制文件 把服务其读取的html文件会写到客户端
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!= -1){
            os.write(bytes,0,len);
        }
        fis.close();
        socket.close();
        server.close();


    }
}
