package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    // 最常用的容器初始化方案(立即加载bean)
    public static void main(String[] args) {
        // 加载类路径下的配置文件(推荐使用)
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext ctx = new FileSystemXmlApplicationContext("applicationContext.xml"); //f:\deaProjects\SSMStudy\applicationContext.xml
        // 从文件系统下加载配置文件(了解即可)
        ApplicationContext ctx = new FileSystemXmlApplicationContext("F:\\deaProjects\\SSMStudy\\src\\main\\resources\\applicationContext.xml"); //f:\deaProjects\SSMStudy\applicationContext.xml


        // 使用bean的名称获取bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // 使用名称获取并指定类型
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao", BookDao.class);
        // 按照类型获取bean(如果有多个同类型的bean,则会报错)
        BookDao bookDao3 = ctx.getBean(BookDao.class);
        bookDao.save();
    }
}
