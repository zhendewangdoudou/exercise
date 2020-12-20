package jdbc;

import utils.jdbcutild;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbc10shiwu {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try{
             conn= jdbcutild.getConnections();
             //开启事务
            conn.setAutoCommit(false);

             //张三-500
            //李四+500
            String sql1 = "update account set balance = balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";
             pstmt1 = conn.prepareStatement(sql1);
             pstmt2 = conn.prepareStatement(sql2);
             pstmt1.setDouble(1,500);
             pstmt2.setInt(2,1);

             pstmt2.setDouble(1,500);
             pstmt1.setInt(2,2);

             pstmt1.executeUpdate();

             int i = 3/0;
             pstmt2.executeUpdate();
             //提交事务
             conn.commit();


        }catch (SQLException e){

            //事务回滚
           try{
               if(conn != null)
               conn.rollback();
           }catch (Exception e1){
               e1.printStackTrace();
           }
            e.printStackTrace();
        }finally {
            jdbcutild.close(pstmt1,conn);
            jdbcutild.close(pstmt2,conn);
        }



    }
}
