package top.mole9630.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.mole9630.damain.Book;
import top.mole9630.dao.BookMapper;
import top.mole9630.service.IBookService;

@Service
public class KBookServiceImpl extends ServiceImpl<BookMapper, Book> implements IBookService { //继承泛型第一个为实现类, 第二个为模型类
    @Autowired
    private BookMapper bookMapper;

    @Override
    public boolean saveBook(Book book) {
        return bookMapper.insert(book) > 0;
    }

    @Override
    public boolean modify(Book book) {
        return bookMapper.updateById(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookMapper.deleteById(id) > 0;
    }
}
