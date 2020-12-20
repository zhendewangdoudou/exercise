package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//shanchu一条记录
public class demo04 {
    public static void main(String[] args)  {
        Statement stmt = null;
        Connection conn = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接duixiang
             conn = DriverManager.getConnection("jdbc:mysql:///redpacket?useSSL=false", "root", "1");
            //3定义sql
            String sql = "delete from account  where id = 3";
            //4获取执行对象
             stmt = conn.createStatement();
            //5执行sql
            int count = stmt.executeUpdate(sql);
            //6处理结果
            System.out.println(count);
            if(count > 0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(stmt != null){
                try{
                    stmt.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null){
                try{
                    conn.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }


    }
}
