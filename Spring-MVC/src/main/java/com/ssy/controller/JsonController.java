package com.ssy.controller;

import com.ssy.pojo.Person;
import com.ssy.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/json")
public class JsonController {
    @PostMapping("/person")
    @ResponseBody
    public String person(@RequestBody Person person) {
        System.out.println("person = " + person);
        return "person ok";
    }

    @PostMapping("/user")
    @ResponseBody
    public User getUser(@RequestBody User user) {
        System.out.println("user"+user);
        User user1 = new User("花花",18,20.98);
        return user1;
    }
}