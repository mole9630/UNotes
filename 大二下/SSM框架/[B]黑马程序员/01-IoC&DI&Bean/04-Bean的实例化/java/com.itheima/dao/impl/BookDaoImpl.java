package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    // 构造方法
    public BookDaoImpl() {
        System.out.println("book dao constructor is running...");
    }

    public void save() {
        System.out.println("book dao save...");
    }
}
