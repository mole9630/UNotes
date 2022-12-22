package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 3.创建SpringMvc的配置类, 加载controller对应的bean
@Configuration
@ComponentScan("com.itheima.controller")
public class SpringMvcConfig {
}
