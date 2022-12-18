package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = (BookService) ctx.getBean(BookService.class);
        bookService.save();
    }
}
