package com.ssy.controller;

import com.ssy.pojo.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserRestfulController {
    @GetMapping
    public String shouAllUser(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page
            , @RequestParam(value = "size", required = false, defaultValue = "10") Integer size) {
        System.out.println(page);
        System.out.println(size);
        return "page ok";
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        System.out.println("user" + user);
        return "add user ok";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Integer id) {
        return "get byID ok";
    }

    @PutMapping
    public String updateUser(@RequestBody User user) {
        System.out.println(user);
        return "update user ok";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        System.out.println(id);
        return "delete user ok";
    }

    @GetMapping("/like")
    public String getUserByName(@RequestParam(value = "keyword",required = false) String keyword,
                                @RequestParam(value = "page",required = false,defaultValue = "10") Integer page,
                                @RequestParam(value = "size",required = false,defaultValue = "1") Integer size) {
        System.out.println(keyword);
        System.out.println(page);
        System.out.println(size);
        return "get by keyword ok";
    }
}
