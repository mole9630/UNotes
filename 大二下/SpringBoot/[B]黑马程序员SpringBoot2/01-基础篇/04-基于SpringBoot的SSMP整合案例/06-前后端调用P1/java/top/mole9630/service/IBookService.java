package top.mole9630.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import top.mole9630.damain.Book;

public interface IBookService extends IService<Book> {
//    @Override // 若有重名的方法名需用Override覆盖, 若Override报错则表示没有重名
    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getPage(int currentPage, int pageSize);
}
