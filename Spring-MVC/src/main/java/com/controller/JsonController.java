package com.controller;

import com.pojo.Person;
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
}