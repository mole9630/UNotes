package top.mole9630;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.mole9630.dao.BookDao;

@SpringBootTest
class SpringStudyApplicationTests {
    // 1. 注入要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        // 2，执行要测试的对象对应的方法
        bookDao.save();
    }

}
