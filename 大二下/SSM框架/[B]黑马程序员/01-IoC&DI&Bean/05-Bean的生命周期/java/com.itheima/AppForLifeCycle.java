package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.context.Theme;

public class AppForLifeCycle {
    public static void main(String[] args) {
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); //该对象内有对应的close方法
        ctx.registerShutdownHook(); //注册关闭钩子 当jvm关闭时,会调用该方法关闭容器 在任意处执行均可
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();

//        ctx.close(); //暴力关闭容器
    }
}
