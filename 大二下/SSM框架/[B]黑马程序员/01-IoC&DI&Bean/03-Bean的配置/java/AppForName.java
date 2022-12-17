import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
        // 3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService service = (BookService) ctx.getBean("service");
        service.save();

        BookService bookEbi = (BookService) ctx.getBean("bookEbi");
        bookEbi.save();
    }
}
