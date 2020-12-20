package utils;

import java.sql.*;
import java.util.Scanner;

/*
练习：
 需求1.通过键盘录入用户名和密码
 2.判断用户是否登录成功
 */
public class dengluanli改进 {

    public static void main(String[] args) {
        //1键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //2调用
        boolean flag = new dengluanli改进().login(username, password);

        //3结果
        if(flag){
            System.out.println("登录成功");
        }else{
            System.out.println("用户名或密码错误");
        }
    }

    /*
    登录方法

     */
    public boolean login(String username,String password){
        if(username == null || password == null){
            return false;
        }
        Connection conn = null;
        Statement stmt =null;
        ResultSet rs = null;
        PreparedStatement pstmt = null;

        //获取连接
        try{
             conn = jdbcutild.getConnections();
            String sql = "select * from user where username = ? and password = ?";
             pstmt = conn.prepareStatement(sql);
          //  pstmt = conn.createStatement();
            pstmt.setString(1,username);
            pstmt.setString(2,password);
             rs = pstmt.executeQuery();
            return rs.next();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            jdbcutild.close(rs,pstmt,conn);
        }
        return false;
    }

}
