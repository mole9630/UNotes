package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {
    public void save() {
        // 记录程序当前执行时间(开始时间)
        Long stratTime = System.currentTimeMillis();
        // 业务执行万次
        for (int i = 0; i < 10000; i++) {
            System.out.println("save running..." + i);
        }
        // 记录程序当前执行时间(结束时间)
        Long endTime = System.currentTimeMillis();
        // 计算程序执行时间差
        Long totalTime = endTime - stratTime;
        // 打印程序执行时间信息
        System.out.println("程序开始执行时间为:" + stratTime);
        System.out.println("程序结束执行时间为:" + endTime);
        System.out.println("程序执行时间差为:" + totalTime + "ms");
    }

    public void update() {
        System.out.println("book dao update...");
    }

    public void delete() {
        System.out.println("book dao delete...");
    }

    public void select() {
        System.out.println("book dao select...");
    }
}