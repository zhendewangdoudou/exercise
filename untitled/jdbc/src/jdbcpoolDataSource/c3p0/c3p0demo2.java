package jdbcpoolDataSource.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class c3p0demo2 {
    public static void main(String[] args) throws SQLException {
       // DataSource ds = new ComboPooledDataSource();
        DataSource ds = new ComboPooledDataSource("otherc3p0");

        for (int i = 1; i < 10; i++) {

            Connection conn = ds.getConnection();
            System.out.println(conn);
        }


    }
}
