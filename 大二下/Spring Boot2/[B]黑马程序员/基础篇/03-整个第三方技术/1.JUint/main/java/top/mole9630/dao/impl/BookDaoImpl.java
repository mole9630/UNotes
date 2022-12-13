package top.mole9630.dao.impl;

import org.springframework.stereotype.Repository;
import top.mole9630.dao.BookDao;

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("BookDao is running...");
    }
}
