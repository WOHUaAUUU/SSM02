package com.ssy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogInterController {

    @GetMapping("/admin/ad")
    public String interceptor() {
        System.out.println("目标查看日志，拦截检查。。。");
        return "查看日志成功";
    }

    @GetMapping("/exit")
    public String interceptor2() {
        System.out.println("目标查看日志，拦截检查2。。。");
        return "查看日志成功 OK";
    }
}
