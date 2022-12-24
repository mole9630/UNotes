package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

// 3.创建SpringMvc的配置类, 加载controller对应的bean
@Configuration
@ComponentScan("com.itheima.controller")
@EnableWebMvc //开启json转化对象的功能
public class SpringMvcConfig {
}
