import com.itheima.dao.OrderDao;
import com.itheima.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过工厂类创建对象
//        OrderDao orderDao = OrderDaoFactory.getOrderDao();
//        orderDao.save();

        // 通过Spring容器创建对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderDao orderDao = (OrderDao) ctx.getBean("orderDao");
        orderDao.save();
    }
}
