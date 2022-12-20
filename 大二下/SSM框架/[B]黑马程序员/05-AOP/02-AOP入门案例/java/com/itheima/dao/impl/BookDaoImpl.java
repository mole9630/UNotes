package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println(System.currentTimeMillis());
        System.out.println("book dao save...");
    }

    public void update() {
        System.out.println("book dao update...");
    }
}