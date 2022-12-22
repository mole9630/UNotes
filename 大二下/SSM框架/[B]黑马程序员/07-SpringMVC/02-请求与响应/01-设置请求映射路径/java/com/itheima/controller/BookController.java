package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @RequestMapping("/book/save")
    @ResponseBody
    public String save() {
        System.out.println("book save...");
        return "{'model':'book'}";
    }
}
