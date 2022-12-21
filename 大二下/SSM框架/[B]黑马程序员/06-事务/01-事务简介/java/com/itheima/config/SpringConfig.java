package com.itheima.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.itheima")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
// 3.开启注解式事务驱动
@EnableTransactionManagement //开启事务
public class SpringConfig {
}
