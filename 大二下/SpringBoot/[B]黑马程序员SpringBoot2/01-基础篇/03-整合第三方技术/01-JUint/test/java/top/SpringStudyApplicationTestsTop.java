package top;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.mole9630.SpringStudyApplication;
import top.mole9630.dao.BookDao;

// 若当前测试类不在引导类所在的包或子包下,则需要指定引导类
@SpringBootTest(classes = SpringStudyApplication.class)
class SpringStudyApplicationTestsTop {
    // 1. 注入要测试的对象
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        // 2，执行要测试的对象对应的方法
        bookDao.save();
    }

}
