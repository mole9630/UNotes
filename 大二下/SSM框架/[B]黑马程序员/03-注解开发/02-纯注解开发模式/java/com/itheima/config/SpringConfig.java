package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan指定扫描的包
//@ComponentScan("com.itheima")
// 若有多个可以用数组的方式
@ComponentScan({"com.itheima.dao", "com.itheima.service"})
public class SpringConfig {
}
