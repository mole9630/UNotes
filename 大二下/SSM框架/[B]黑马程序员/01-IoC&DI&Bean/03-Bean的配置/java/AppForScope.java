import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    /**
     * 默认情况下，Spring容器中的Bean是单例的
     * 适合交给容器进行管理的bean(即:不需要每次都创建新的对象-单例)
     *  表现层对象
     *  业务层对象
     *  数据层对象
     *  工具对象
     * 不适合交给容器进行管理的bean(即:需要每次都创建新的对象-非单例)
     *  封装实体的域对象
     */
    public static void main(String[] args) {
        // 3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        // scope="singleton" com.itheima.dao.impl.BookDaoImpl@3159c4b8
        // scope="prototype" com.itheima.dao.impl.BookDaoImpl@3159c4b8
        System.out.println(bookDao1);
        // scope="singleton" com.itheima.dao.impl.BookDaoImpl@3159c4b8
        // scope="prototype" com.itheima.dao.impl.BookDaoImpl@73846619
        System.out.println(bookDao2);
    }
}
