package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public String findName(int id, String password) {
        System.out.println("id:" + id);
        return "mole";
    }
}