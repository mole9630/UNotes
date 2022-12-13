package top.mole9630.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// 1.定义数据模型,封装yml文件中对应的数据
// 2.定义为Spring管控的bean
@Component
// 3.使用@ConfigurationProperties注解,指定加载的数据
@ConfigurationProperties(prefix = "user")
public class User {
    private String uname;
    private String age;

    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uname='" + uname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
