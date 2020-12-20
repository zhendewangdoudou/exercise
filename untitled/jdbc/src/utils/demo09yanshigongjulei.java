package utils;

import lianxi.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class demo09yanshigongjulei {

    /*
    演示工具类
    查询所有emp对象
     */
    public List<Emp> findAll(){
        Statement stmt = null;
        Connection conn = null;
        ResultSet rs = null;
        List<Emp> list= null;
        try{
            /*
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///redpacket?useSSL=false", "root", "1");

             */

            conn = jdbcutild.getConnections();
            //3.定义sql
            String sql = "select * from emp1";
            //获取sql对象
             stmt = conn.createStatement();
            //执行sql
             rs = stmt.executeQuery(sql);
            //遍历结果集封装对象
            Emp emp = null;
            list = new ArrayList<Emp>();
            while(rs.next()){
                //获取
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                //创建empduixinag
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                //装在集合
                list.add(emp);


            }

        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
           /*
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

            */

           jdbcutild.close(rs,stmt,conn);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Emp> list = new demo09yanshigongjulei().findAll();
        System.out.println(list);
        System.out.println(list.size());
    }
}
