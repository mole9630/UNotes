package top.mole9630.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import top.mole9630.damain.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);

    Boolean update(Book book);

    Boolean delete(Integer id);

    Book getById(Integer id);

    List<Book> getAll();

    IPage<Book> getPage(int currentPage, int pageSize);
}
