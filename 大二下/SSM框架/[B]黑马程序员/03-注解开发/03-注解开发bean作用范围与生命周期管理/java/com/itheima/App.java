package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao1 = (BookDao) ctx.getBean(BookDao.class);
        BookDao bookDao2 = (BookDao) ctx.getBean(BookDao.class);
        System.out.println(bookDao1);
        System.out.println(bookDao2);

        ctx.close();
    }
}
