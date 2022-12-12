package top.mole9630.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping
    public String getCountry() {
        System.out.println("country: " + country);
        System.out.println("name1: " + name1);
        System.out.println("like: " + like);
        System.out.println("age: " + age);
        System.out.println("port: " + port);
        System.out.println("tempDir: " + tempDir);
        System.out.println("tempDir2: " + tempDir2);
        return "SpringBoot is running...";
    }
}
