package com.example.springbootdemoforproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: YoYo
 * @Date: 2020-01-09 07:47
 */
@Controller
public class HelloController {
    @RequestMapping("hello")
    public String hello(){
        return "login";
    }
}
