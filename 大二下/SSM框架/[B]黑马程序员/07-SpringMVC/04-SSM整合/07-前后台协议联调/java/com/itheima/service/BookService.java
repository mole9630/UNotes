package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    /**
     * 保存图书
     * @param book 图书对象
     * @return 是否保存成功
     */
    public boolean save(Book book);

    /**
     * 修改图书信息
     * @param book 图书对象
     * @return 是否修改成功
     */
    public boolean update(Book book);

    /**
     * 删除图书
     * @param id 图书id
     * @return 是否删除成功
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询图书
     * @param id 图书id
     * @return 图书对象
     */
    public Book getById(Integer id);

    /**
     * 查询所有图书
     * @return 图书集合
     */
    public List<Book> getAll();
}
