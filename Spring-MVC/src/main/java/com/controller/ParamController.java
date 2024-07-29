package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/param")
public class ParamController {
    @GetMapping("/date")
    @ResponseBody
    public String date(String username, String password, Integer age) {
        System.out.println(username);
        System.out.println(password);
        System.out.println(age);
        return "date";
    }

    @GetMapping("reqDate")
    @ResponseBody
    public String reqDate(@RequestParam(value = "username", required = false, defaultValue = "hh") String username, String password, Integer age) {
        System.out.printf("username:" + username + "password:" + password + "age:" + age);
        return "reqDate ok";
    }

    // 定义一个请求路径为/list的GET请求
    @GetMapping("/list")
    // 返回响应体
    @ResponseBody
    public String reqlist(@RequestParam("hobbies") List<String> hobbies) {
        // 遍历hobbies列表，并使用System.out::println打印
        hobbies.forEach(System.out::println);
        // 返回字符串"hobbies"
        return "hobbies";
    }

    @GetMapping("list2")
    @ResponseBody
    public String reqlist2(User user)  {
        System.out.println(user);
        return "User ok" ;
    }
}
