package top.mole9630.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.mole9630.pojo.User;

@RestController
@RequestMapping("/eg")
public class ExampleController {
    // 读取yaml数据中的单一数据
    @Value("${country}")
    private String country; //名字不一定要和yaml中的一样

    @Value("${user.uname}")
    private String name1;

    @Value("${likes[1]}")
    private String like;

    @Value("${users[1].age}")
    private String age;

    @Value("${server.port}")
    private String port;

    @Value("${tempDir}")
    private String tempDir;

    @Value("${tempDir2}")
    private String tempDir2;

    // 使用自动装配将所有的数据封装到一个Environment对象中
    @Autowired
    private Environment env;

    @Autowired
    private User user;

    @GetMapping
    public String getCountry() {
        System.out.println("country: " + country);
        System.out.println("name1: " + name1);
        System.out.println("like: " + like);
        System.out.println("age: " + age);
        System.out.println("port: " + port);
        System.out.println("tempDir: " + tempDir);
        System.out.println("tempDir2: " + tempDir2);
        System.out.println("----------------------");
        System.out.println("env-country: " + env.getProperty("country"));
        System.out.println("env-tempDir: " + env.getProperty("tempDir"));
        System.out.println("----------------------");
        System.out.println("user: " + user);
        return "SpringBoot is running...";
    }
}
