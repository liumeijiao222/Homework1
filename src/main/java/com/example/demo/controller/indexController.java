package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    //主页面入口
    @GetMapping("/")
    public String regiset() {
        return "login2";
    }
}
