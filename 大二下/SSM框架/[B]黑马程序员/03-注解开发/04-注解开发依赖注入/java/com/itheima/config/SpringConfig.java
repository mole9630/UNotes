package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.itheima") // @ComponentScan指定扫描的包
@PropertySource("classpath:jdbc.properties") //指定配置文件的位置, 多个配置文件可以使用数组({})包裹, 但不支持通配符(*)格式
public class SpringConfig {
}
