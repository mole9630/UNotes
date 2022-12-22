import com.itheima.config.SpringConfig;
import com.itheima.controller.UserController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    // 验证Controller注解有没有被过滤
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        System.out.println(ctx.getBean(UserController.class));
    }
}
