package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    // 通过@RequestMapping注解映射"/hello"的URL路径
@RequestMapping("/hello")
// 通过@ResponseBody注解将返回值转换为JSON或XML格式
    @ResponseBody
// 定义一个hello()方法，返回字符串"hello MVC"
    public String hello() {
        return "hello MVC";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index1";
    }
}
