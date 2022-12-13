package top.mole9630;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class Test {
    public static DataSource dataSourced = null;
    static {
        // 创建数据源
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql:///cakeshop");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");
        dataSourced = basicDataSource;
    }


    public static void main(String[] args) {
        try {
            Connection connection = dataSourced.getConnection();  // 通过数据源获取链接对象
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
