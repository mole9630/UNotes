package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {
//    @Value("mole")
    @Value("${jdbc.name}") //从配置文件中读取
    private String name;
    public void save() {
        System.out.println("book dao save2... | " + name);
    }
}
