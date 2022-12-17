package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save...");
    }

    // 表示bean初始化对应的操作
    public void init() {
        System.out.println("book dao init...");
    }

    // 表示bean销毁前对应的操作
    public void destroy() {
        System.out.println("book dao destroy...");
    }
}
