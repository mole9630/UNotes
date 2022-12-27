package top.mole9630.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.mole9630.damain.Book;

@SpringBootTest
public class BookMapperTestCase {
    @Autowired
    private BookMapper bookMapper;

    // 自定义方法测试
    @Test
    void testGetByIdFunction(){
        bookMapper.selectById(1);
    }

    // 根据id查询
    @Test
    void testGetById(){
        bookMapper.selectById(1);
    }

    // 增加方法
    @Test
    void testSave(){
        Book book = new Book();
        book.setName("SpringBoot程序开发");
        book.setType("程序开发");
        book.setDescription("SpringBoot零基础到进阶程序开发");
        bookMapper.insert(book);
    }

    // 修改方法
    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(5);
        book.setName("SpringBoot程序开发");
        book.setType("程序开发");
        book.setDescription("SpringBoot零基础到进阶程序开发");
        bookMapper.updateById(book);
    }

    // 删除方法
    @Test
    void testDelete(){
        bookMapper.deleteById(18);
    }

    // 查询所有
    @Test
    void testGetAll(){
        bookMapper.selectList(null);
    }

    // 分页查询
    @Test
    void testGetPage(){
        // 假设共5条数据，每页显示3条
        IPage page = new Page(2, 3); //核心对象 设置当前第一页，每页5条
        bookMapper.selectPage(page,null); // 此处也可以加qw和lqw条件查询对象
        System.out.println("current:" + page.getCurrent()); //当前页 2
        System.out.println("pages:" + page.getPages()); //总页数 2
        System.out.println("size:" + page.getSize()); //每页显示条数 2
        System.out.println("total:" + page.getTotal()); //总条数 5
        System.out.println("records:" + page.getRecords()); //当前页数据
    }

    // 按条件查询
    @Test
    void testGet(){
        QueryWrapper<Book> queryWrapper = new QueryWrapper<>();
        queryWrapper.like(true ,"name","Spring"); //模糊查询 第一个参数为条件, 若为true则执行按条件查询, 查询列为"name", 值为"Spring"的数据
        bookMapper.selectList(queryWrapper);
    }

    // 按条件查询2
    @Test
    void testGet2(){
//        String name = "Spring";
        String name = null;
        LambdaQueryWrapper<Book> lambdaQueryWrapper = new LambdaQueryWrapper<>(); //可做语法级检查
//        lambdaQueryWrapper.like(name != null , Book::getName,"Spring"); //模糊查询 第一个参数为条件, 若为false则执行查询所有(无条件), 查询列为"name", 值为"Spring"的数据
        lambdaQueryWrapper.like(Strings.isNotEmpty(name) , Book::getName,"Spring"); //模糊查询 与上同理 第一个参数为条件, 若为false则执行查询所有(无条件), 查询列为"name", 值为"Spring"的数据
        bookMapper.selectList(lambdaQueryWrapper);
    }
}
