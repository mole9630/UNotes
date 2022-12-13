package top.mole9630;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Properties;

public class TestConfig {
    public static DataSource dataSource = null;
    static {
        Properties properties = new Properties();
        InputStream inputStream = new TestConfig().getClass().getClassLoader().getResourceAsStream("dbcpconfig.properties");
        try {
            properties.load(inputStream);
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Connection connection = dataSource.getConnection();  // 通过数据源获取链接对象
//            System.out.println(connection);
            DatabaseMetaData metaData = connection.getMetaData();  // 获取链接信息
            System.out.println(metaData.getURL());
            System.out.println(metaData.getUserName());
            System.out.println(metaData.getDriverName());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
