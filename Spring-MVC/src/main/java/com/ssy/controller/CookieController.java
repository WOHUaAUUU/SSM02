package com.ssy.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/cookie")
public class CookieController {
    @GetMapping("/get")
    @ResponseBody

    public String getCookie(@CookieValue("JSESSIONID") String sessionId)  {
        System.out.println("sessionId"+sessionId);
        return "Cookie is OK";
    }
    @GetMapping("/set")
    @ResponseBody
    public String setCookie(HttpSession session)    {
        String id = session.getId();
        System.out.println(id);
        return "Cookie is set";
    }
}
