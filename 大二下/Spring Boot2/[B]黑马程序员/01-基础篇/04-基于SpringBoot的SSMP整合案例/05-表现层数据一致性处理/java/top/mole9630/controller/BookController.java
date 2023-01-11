package top.mole9630.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.mole9630.damain.Book;
import top.mole9630.service.IBookService;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController {
//    @Autowired
    private IBookService bookService;

    /**
     * 查询全部图书
     * @return 图书列表
     */
    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }

    /**
     * 新增图书
     * @param book 图书对象
     * @return 是否成功
     */
    @PostMapping
    public boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    /**
     * 修改图书
     * @param book 图书对象
     * @return 是否成功
     */
    @PutMapping
    public boolean update(@RequestBody Book book){
        return bookService.modify(book);
    }

    /**
     * 删除图书
     * @param id 图书id
     * @return 是否成功
     */
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id){
        return bookService.removeById(id);
    }

    /**
     * 根据id查询图书
     * @param id 图书id
     * @return 图书对象
     */
    @GetMapping("/{id}")
    public Book getById(@PathVariable Integer id){
        return bookService.getById(id);
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return bookService.getPage(currentPage, pageSize);
    }
}
