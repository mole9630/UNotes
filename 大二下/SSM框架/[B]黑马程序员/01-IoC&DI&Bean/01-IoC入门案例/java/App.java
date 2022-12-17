import com.itheima.service.BookService;
import com.itheima.service.impl.BookServiceImpl;

public class App {
    // 不适用Spring的情况下, 我们需要手动创建对象
    public static void main(String[] args) {
        // 创建service对象
        BookService bookService = new BookServiceImpl();
        // 调用方法
        bookService.save();
    }
}
