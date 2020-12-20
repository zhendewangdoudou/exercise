package jdbcpoolDataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
c3p0演示

 */
public class c3p0demo {

    public static void main(String[] args) throws SQLException {
        //1.导包 2个

        //2.定义配置文件

        //3,。创建核心对象 数据库连接池对象
        DataSource ds = new ComboPooledDataSource();
        //4获取连接对象
        Connection conn = ds.getConnection();

        //打印
        System.out.println(conn);


    }
}
