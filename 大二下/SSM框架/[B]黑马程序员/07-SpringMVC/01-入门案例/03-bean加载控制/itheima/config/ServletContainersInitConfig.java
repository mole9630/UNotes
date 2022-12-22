package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// 4.定义一个servlet容器启动的配置类, 在里面加载spring的配置
/**
 * public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
 *     // 加载SpringMvc容器的配置
 *     protected WebApplicationContext createServletApplicationContext() {
 *         AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext(); //初始化WebApplicationContext
 *         ctx.register(SpringMvcConfig.class); //加载SpringMvc的配置类
 *         return ctx;
 *     }
 *
 *     // 设置哪些请求归属SpringMvc处理
 *     protected String[] getServletMappings() {
 *         return new String[]{"/"}; //设置所有请求都归属SpringMvc处理
 *     }
 *
 *     // 加载Spring容器的配置
 *     protected WebApplicationContext createRootApplicationContext() {
 *         AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext(); //初始化WebApplicationContext
 *         ctx.register(SpringConfig.class); //加载Spring的配置类
 *         return ctx;
 *     }
 * }
 */

// 简化开发写法
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}