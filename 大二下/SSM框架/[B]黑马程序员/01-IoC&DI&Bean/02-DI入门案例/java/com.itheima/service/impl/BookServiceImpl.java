package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.dao.impl.BookDaoImpl;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    // 5.删除业务层中使用new的方式创建的dao对象
    private BookDao bookDao;
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    // 6.提供set方法，用于注入
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
