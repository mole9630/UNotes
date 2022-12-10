package top.mole9630.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.mole9630.pojo.User;

@Controller
public class UserController {
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id){
        System.out.println("user delete..." + id);
        return "{'module':'user delete'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user){
        System.out.println("user update..." + user);
        return "{'module':'user update'}";
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getByID(@PathVariable Integer id){
        System.out.println("user getByID..." + id);
        return "{'module':'user getByID'}";
    }

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @ResponseBody
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }
}
