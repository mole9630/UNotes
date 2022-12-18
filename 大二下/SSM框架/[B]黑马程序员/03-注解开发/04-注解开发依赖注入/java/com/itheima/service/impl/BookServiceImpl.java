package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired //@Autowired根据类型自动装配, 可以省略setter方法
    @Qualifier("bookDao2") //@Qualifier指定装配的bean的id
    private BookDao bookDao;
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }
}
