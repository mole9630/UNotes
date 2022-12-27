package top.mole9630;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.mole9630.dao.impl.BookMapperDao;

@SpringBootTest
class BookSelectByIdTest {
    @Autowired
    private BookMapperDao bookMapperDao;

    @Test
    void contextLoads() {
        System.out.println(bookMapperDao.getById(1));
    }
}
