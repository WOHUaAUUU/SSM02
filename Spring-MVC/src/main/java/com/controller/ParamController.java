package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping ("/date")
    @ResponseBody
    public String date(String username,String password,Integer age) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        return "date";
    }
}
