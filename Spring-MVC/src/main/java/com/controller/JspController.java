package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspController {
    @GetMapping("/toIndex")
    public String toIndex(Model model) {
        model.addAttribute("msg", "Hello JSP");
        return "index";
    }

    // 通过@GetMapping注解映射"/jump"请求
//  转发：forward,重定向：redirect
@GetMapping("/jump")
    public String jump(Model model) {
        // 将"msg"属性添加到model中
        model.addAttribute("msg", "Hello-OVERRIDE-JSP");
        // 返回"forward:/jsp/forward"，进行重定向至"/jsp/forward"
        return "forward:/jsp/forward";
    }

// 通过@GetMapping注解映射"/forward"请求
@GetMapping("/forward")
    public String forward() {
        // 打印"已进行重定向，跳转至forward.jsp"
        System.out.println("已进行重定向，跳转至forward.jsp");
        // 返回"forward"，进行重定向至"/jsp/forward"
        return "forward";
    }
}
