package top.mole9630.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.mole9630.damain.Book;
import top.mole9630.service.impl.BookServiceImpl;

@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;

    // 根据id查询
    @Test
    void testGetById(){
        bookService.getById(4);
    }

    // 增加方法
    @Test
    void testSave(){
        Book book = new Book();
        book.setName("SpringBoot程序开发");
        book.setType("程序开发");
        book.setDescription("SpringBoot零基础到进阶程序开发");
        bookService.save(book);
    }

    // 修改方法
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(20);
        book.setName("SpringBoot程序开发");
        book.setType("程序开发(改)");
        book.setDescription("SpringBoot零基础到进阶程序开发");
        bookService.update(book);
    }

    // 删除方法
    @Test
    void testDelete(){
        bookService.delete(20);
    }

    // 查询所有
    @Test
    void testGetAll(){
        bookService.getAll();
    }

    // 分页查询
    @Test
    void testGetPage(){
        // 假设共5条数据，每页显示3条
        IPage<Book> page = bookService.getPage(1, 5);// 设置当前第一页，每页5条
        System.out.println("current:" + page.getCurrent()); //当前页 2
        System.out.println("pages:" + page.getPages()); //总页数 2
        System.out.println("size:" + page.getSize()); //每页显示条数 2
        System.out.println("total:" + page.getTotal()); //总条数 5
        System.out.println("records:" + page.getRecords()); //当前页数据
    }

}
