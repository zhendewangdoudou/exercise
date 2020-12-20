package jdbctemplate;

import jdbcpoolDataSource.utils.jdbcutils;
import org.springframework.jdbc.core.JdbcTemplate;

/*
rumen
 */
public class demo {
    public static void main(String[] args) {
        //导包

        //创建jdbctemplate对私昂
        JdbcTemplate template = new JdbcTemplate(jdbcutils.getDataSource());

        //调用方法
        String sql = "update account set balance = 5000 where id = ?";
        int count =  template.update(sql,3);
        System.out.println(count);
    }
}
