package com.itheima.service;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookService {
    /**
     * 保存图书
     * @param book
     * @return
     */
    public boolean save(Book book);

    /**
     * 修改图书信息
     * @param book
     * @return
     */
    public boolean update(Book book);

    /**
     * 删除图书
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询图书
     * @param id
     * @return
     */
    public Book getById(Integer id);

    /**
     * 查询所有图书
     * @return
     */
    public List<Book> getAll();
}
