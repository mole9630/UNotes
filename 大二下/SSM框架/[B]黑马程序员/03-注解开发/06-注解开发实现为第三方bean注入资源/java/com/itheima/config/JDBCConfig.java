package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JDBCConfig {
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql:///ssm_db")
    private String url;
    @Value("root")
    private String username;
    @Value("root")
    private String password;

    @Bean
    public DataSource dataSource(BookDao bookDao) { // 引用类型注入只需要为bean定义方法设置形参即可, 容器会根据类型自动装配对象
        System.out.println("bookDao = " + bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }
}
