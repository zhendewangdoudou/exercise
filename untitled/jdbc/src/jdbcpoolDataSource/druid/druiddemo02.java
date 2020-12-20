package jdbcpoolDataSource.druid;

import jdbcpoolDataSource.utils.jdbcutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
使用新的工具类
 */
public class druiddemo02 {
    public static void main(String[] args) {
        /*
        给account表添加一条记录

         */

        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            //获取连接 //获取连接
             conn = jdbcutils.getConnection();

            //定义sql
            String sql = "insert into account values(null,?,?)";

            //获取pstmt对象
             pstmt = conn.prepareStatement(sql);

            //给？赋值
            pstmt.setString(1,"王五");
            pstmt.setDouble(2,3000);
            //执行sql'
            int count = pstmt.executeUpdate();
            System.out.println(count);
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            //释放资源
            jdbcutils.close(pstmt,conn);
        }
    }
}
