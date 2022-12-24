package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(String name, Integer age) {
        System.out.println("普通参数传递 name --> " + name);
        System.out.println("普通参数传递 age --> " + age);
        return "{'model':'common param'}";
    }
}
