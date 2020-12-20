package jdbc;

import java.sql.*;

//执行ddl语句
public class demo06 {
    public static void main(String[] args)  {
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        try{
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接duixiang
             conn = DriverManager.getConnection("jdbc:mysql:///redpacket?useSSL=false", "root", "1");
            //3定义sql
            String sql = "select * from account";
            //4获取执行对象
             stmt = conn.createStatement();
            //5执行sql
             rs = stmt.executeQuery(sql);
            //6处理结果
          //6.1让游标向下移动一行
            /*

            rs.next();
            //6.2获取数据
            int id = rs.getInt(1);
            String name = rs.getString("name");
            double balance = rs.getDouble(3);
            System.out.println(id + "----"+name + "---"+balance);

             */
            /*
            if(count > 0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
            */
            while (rs.next()){
                //6.2获取数据
                int id = rs.getInt(1);
                String name = rs.getString("name");
                double balance = rs.getDouble(3);
                System.out.println(id + "----"+name + "---"+balance);
            }


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(rs != null){
                try{
                    rs.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
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
