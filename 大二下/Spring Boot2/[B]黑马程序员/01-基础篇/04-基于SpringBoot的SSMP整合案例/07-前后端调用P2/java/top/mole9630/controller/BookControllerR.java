package top.mole9630.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.mole9630.controller.utils.R;
import top.mole9630.damain.Book;
import top.mole9630.service.IBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookControllerR {
    @Autowired
    private IBookService bookService;

    /**
     * 查询全部图书
     * @return 图书列表
     */
    @GetMapping
    public R getAll(){
        return new R(true, bookService.list());
    }

    /**
     * 新增图书
     * @param book 图书对象
     * @return 是否成功
     */
    @PostMapping
    public R save(@RequestBody Book book) throws Exception {
        if (book.getName().equals("123")) {
            throw new Exception();
        }
        boolean flag = bookService.save(book);
        return new R(flag, flag ? "数据添加成功!" : "数据添加失败!");
    }

    /**
     * 修改图书
     * @param book 图书对象
     * @return 是否成功
     */
    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.modify(book));
    }

    /**
     * 删除图书
     * @param id 图书id
     * @return 是否成功
     */
    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id){
        return new R(bookService.removeById(id));
    }

    /**
     * 根据id查询图书
     * @param id 图书id
     * @return 图书对象
     */
    @GetMapping("/{id}")
    public R getById(@PathVariable Integer id){
        return new R(true, bookService.getById(id));
    }

    /**
     * 分页查询图书
     * @param currentPage 当前页
     * @param pageSize 每页显示条数
     * @return 图书列表
     */
//    @GetMapping("/{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        IPage<Book> page = bookService.getPage(currentPage, pageSize);
//        // [修复bug]如果当前页码值大于总页码值, 那么执行查询时使用最大页码值为当前页码值
//        if (currentPage > page.getPages()) {
//            page = bookService.getPage((int) page.getPages(), pageSize);
//        }
//        return new R(true, page);
//    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize, Book book){
        IPage<Book> page = bookService.getPage(currentPage, pageSize, book);
        // [修复bug]如果当前页码值大于总页码值, 那么执行查询时使用最大页码值为当前页码值
        if (currentPage > page.getPages()) {
            page = bookService.getPage((int) page.getPages(), pageSize, book);
        }
        return new R(true, page);
    }
}
