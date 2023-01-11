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
    public R save(@RequestBody Book book){
        return new R(bookService.save(book));
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

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
        return new R(true, bookService.getPage(currentPage, pageSize));
    }
}
