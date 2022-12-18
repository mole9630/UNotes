package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// 使用@Component注解定义bean,并指定id为bookDao
//@Component("bookDao")
// 使用@Repository注解定义bean,与@Component注解功能一致,只是为了更好的表达数据层的意思
// @Controller, @Service, @Repository注解都是@Component的衍生注解, 功能一致
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    public void save() {
        System.out.println("book dao save...");
    }
}
