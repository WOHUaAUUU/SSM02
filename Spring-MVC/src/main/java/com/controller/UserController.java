package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/jst")
public class UserController {
    @PostMapping("user")
    @ResponseBody

    public String user(@RequestBody User user) {
        System.out.println("user"+user);
        return "user";
    }
}
