package top.mole9630.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest模式
@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping
    public String getByID(){
        System.out.println("getByID is running...");
        return "getByID is running...";
    }
}
