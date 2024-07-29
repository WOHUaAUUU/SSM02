package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/path")
public class pathController {
    @GetMapping("/{id}")
    @ResponseBody
    public String showUserById(@PathVariable("id") Integer id) {
        System.out.println("id:"+id);
        return "Hello path";
    }
    @GetMapping("/{id2}/{name}/{cls}")
    @ResponseBody
    public String showUserById2(@PathVariable("id2") Integer id,
                               @PathVariable("name") String name,
                               @PathVariable("cls") String cls) {
            System.out.println("id:"+id);
        System.out.println("name:"+name);
        System.out.println("cls:"+cls);
        return "lu ok";
}

}
