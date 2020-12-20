package utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
练习：
 需求1.通过键盘录入用户名和密码
 2.判断用户是否登录成功
 */
public class dengluanli {

    public static void main(String[] args) {
        //1键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        //2调用
        boolean flag = new dengluanli().login(username, password);

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

        //获取连接
        try{
             conn = jdbcutild.getConnections();
            String sql = "select * from user where username = '"+username+"'and password = '"+ password+"' ";
             stmt = conn.createStatement();
             rs = stmt.executeQuery(sql);
            return rs.next();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            jdbcutild.close(rs,stmt,conn);
        }
        return false;
    }

}
