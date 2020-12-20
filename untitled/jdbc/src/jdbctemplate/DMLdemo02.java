package jdbctemplate;

import jdbcpoolDataSource.utils.jdbcutils;
import datasource.Emp;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class DMLdemo02 {

    //获取jdbctemplate对象
    private JdbcTemplate template = new JdbcTemplate(jdbcutils.getDataSource());

    //junit单元测试  salary 为10000

    /*
    修改1号数据的salary为10000
     */
    @Test
    public void test1(){


        //定义sql
        String sql = "update emp1 set salary = 10000 where id = 1001";
        //执行sql
        int count = template.update(sql);
        System.out.println(count);
    }

    /*
    添加一条数据
     */
    @Test
    public void test2(){

        //定义sql
        String sql = "insert into emp1(id,ename,dept_id) values(?,?,?)";
        //执行sql
        int count = template.update(sql,1015,"郭靖",10);
        System.out.println(count);
    }

    /*
   3 删除刚才添加的记录
    */
    @Test
    public void test3(){

        //定义sql
        String sql = "delete from emp1 where id = ?";
        //执行sql
        int count = template.update(sql,1015);
        System.out.println(count);
    }

    /*
  4 查询id为1的记录 并将其封装为map集合
   */
    @Test
    public void test4(){

        //定义sql
        String sql = "select * from emp1 where id = ?";
        //执行sql
        Map<String,Object> map = template.queryForMap(sql,1001);
        System.out.println(map);
    }
    /*
5查询所有的记录 并将其封装为List
 */
    @Test
    public void test5(){

        //定义sql
        String sql = "select * from emp1 ";
        //执行sql
        List<Map<String,Object>> list = template.queryForList(sql);
        System.out.println(list);
    }

    /*
6查询所有的记录 并将其封装为emp对象在装在到list
*/
    @Test
    public void test6(){

        //定义sql
        String sql = "select * from emp1 ";
        //执行sql
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {

            @Override
            public Emp mapRow(ResultSet rs, int i) throws SQLException {
                Emp emp = new Emp();
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);
                return emp;

            }
        });

        for(Emp emp:list){
            System.out.println(emp);
        }
    }

    /*
改进6查询所有的记录 并将其封装为emp对象在装在到list
*/
    @Test
    public void test6_2(){

        //定义sql
        String sql = "select * from emp1 ";
        //执行sql
        List<Emp> list = template.query(sql,new BeanPropertyRowMapper<Emp>(Emp.class));

        for (Emp emp : list) {
            System.out.println(emp);
        }
    }
    /*
7查询总记录数
  */
    @Test
    public void test7(){

        //定义sql
        String sql = "select count(id) from emp1 ";
        //执行sql
        Long total = template.queryForObject(sql, Long.class);
        System.out.println(total);
    }


}
