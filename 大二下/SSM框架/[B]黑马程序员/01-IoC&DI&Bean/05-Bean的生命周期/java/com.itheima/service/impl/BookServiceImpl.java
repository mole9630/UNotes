package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    private BookDao bookDao;
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    // 提供set方法，用于注入
    public void setBookDao(BookDao bookDao) {
        System.out.println("setBookDao...");
        this.bookDao = bookDao;
    }

    public void destroy() throws Exception {
        System.out.println("book service destroy...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("book service init...");
    }
}
