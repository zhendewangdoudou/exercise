package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//添加一条记录
public class demo02 {
    public static void main(String[] args)  {
        Statement stat = null;
        Connection conn = null;
      try{
          //1.导入驱动jar包
          //2.注册驱动
          Class.forName("com.mysql.jdbc.Driver");
          //3.定义sql
          String sql = "insert into account values(null,'王五',3000)";
          //4获取connection对象
          conn = DriverManager.getConnection("jdbc:mysql:///redpacket?useSSL=false", "root", "1");
          //5获取执行sql对象 statement
          stat = conn.createStatement();
          //6执行sql
          int count = stat.executeUpdate(sql);
          //7处理结果
          System.out.println(count);
          if(count>0){
              System.out.println("添加成功");
          }else{
              System.out.println("添加失败");
          }

      }catch (ClassNotFoundException e){
          e.printStackTrace();
      } catch (SQLException e) {
          e.printStackTrace();
      }
      finally {
         // stat.close();
          //conn.close();
          //避免空指针异常
          if(stat != null){
              try{
                  stat.close();
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
