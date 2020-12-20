package jdbcpoolDataSource.druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druiddemo01 {
    public static void main(String[] args) throws Exception {

        //导包
        //定义配置文件
        //加载配置文件
        Properties pro = new Properties();
        InputStream is = druiddemo01.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);

        //获取数据库连接池对象
        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        //获取连接
        Connection conn = ds.getConnection();
        System.out.println(conn);
    }
}
