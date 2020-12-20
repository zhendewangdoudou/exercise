package utils;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;
import java.util.stream.Stream;

public class jdbcutild {
    private  static String url;
    private static String user;
    private static String password;
    private static String driver;
    /*
    文件的读取，读一次，静态代码块完成

     */
  static {

       try{
           Properties pro = new Properties();

           ClassLoader classLoader = jdbcutild.class.getClassLoader();
           URL res = classLoader.getResource("jdbc.properties");
           String path = res.getPath();
           System.out.println(path);

           pro.load(new FileReader(path));
           jdbcutild.url = pro.getProperty("url");
           user = pro.getProperty("user");
           password = pro.getProperty("password");
           driver = pro.getProperty("driver");
           Class.forName(driver);
       }catch (IOException e){
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }

    }
    /*
    获取连接，返回连接对象
     */
    public static Connection getConnections() throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public static void close( Statement stmt,Connection conn){
        if(stmt != null){
            try {
                stmt.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

    public static void close(ResultSet rs,Statement stmt, Connection conn){
        if(rs != null){
            try {
                rs.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(stmt != null){
            try {
                stmt.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if(conn != null){
            try {
                conn.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}
