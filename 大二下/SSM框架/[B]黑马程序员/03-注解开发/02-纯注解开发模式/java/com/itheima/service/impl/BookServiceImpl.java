package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// 使用@Service注解定义bean, 与@Component注解功能一致, 只是为了更好的表达业务层的意思
//@Component
@Service
public class BookServiceImpl implements BookService {
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
}
