package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"com.itheima.dao", "com.itheima.service"}) //方式1
@ComponentScan(
        value = "com.itheima",
        excludeFilters = @ComponentScan.Filter(
            type = FilterType.ANNOTATION, //按注解去过滤
            classes = {Controller.class} //排除Controller注解配置的类
        )) //方式2
public class SpringConfig {
}
