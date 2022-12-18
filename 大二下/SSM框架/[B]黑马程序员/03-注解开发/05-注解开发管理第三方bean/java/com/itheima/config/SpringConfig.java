package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
//@ComponentScan("com.itheima.config")// 方式1
@Import(JDBCConfig.class) // 方式2:导入其他配置类, 多个用数组导入(推荐使用)
public class SpringConfig {
}
