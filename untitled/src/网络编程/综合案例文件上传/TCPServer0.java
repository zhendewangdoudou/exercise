package 网络编程.综合案例文件上传;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
服务器端
数据源：客户端上传的文件
目的地：服务器的硬盘D:\xuexi\买的java\1-3-Java语言高级\07-网络编程\第3节 综合案例_文件上传

 */
public class TCPServer0 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);

        /*
        让服务器一直处于监听状态（死循环accept方法
        有一个就客户端上传文件就保存一个文件
        */
        while(true){
            Socket socket = server.accept();

            InputStream is = socket.getInputStream();
            File file = new File("D:\\xuexi\\买的java\\2");
            File log;
            if(!file.exists()){
                file.mkdirs();
            }
        /*
        自定义一个文件的命名规则 防止同名的文件被覆盖
        规则：域名+毫秒值+随机数
         */
            String fileName = "itcast"+System.currentTimeMillis()+new Random().nextInt(999999)+".jpg";
//        FileOutputStream fos = new FileOutputStream(file+"\\1.jpg");
            FileOutputStream fos = new FileOutputStream(file+"\\"+fileName);

            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = is.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }

            //OutputStream os = socket.getOutputStream();
           // os.
            try {
                log = new File("D:\\xuexi\\买的java\\2\\log.txt");
                if (!log.exists()) {
                    log.createNewFile();
                }
                FileOutputStream fw = new FileOutputStream(log,true);//追加内容
                Writer out = new OutputStreamWriter(fw,"utf-8");
                out.write(fileName + "上传成功");
                String newline = System.getProperty("line.separator");
                //写入换行  
                 out.write(newline);
                out.close();
                fw.flush();
                fw.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }





            fos.close();
            socket.close();



        }
        //服务器不用关闭
        //server.close();



    }
}
