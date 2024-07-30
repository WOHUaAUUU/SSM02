package com.ssy.controller;

import com.ssy.util.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @GetMapping("/m1")
    public R m1() {
        System.out.println("OK");
        int i = 1 / 0;
        return R.ok(null);
    }
}
