package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.导入驱动jar包
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        //?useSSL=false
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/redpacket?useSSL=false","root","1");
        //4.定义sql语句
        String sql = "update account set balance = 500 where id = 1";
        //5、获取执行sql的对象statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //chuli
        System.out.println(count);
        //释放
        stmt.cancel();
        conn.close();
    }
}
