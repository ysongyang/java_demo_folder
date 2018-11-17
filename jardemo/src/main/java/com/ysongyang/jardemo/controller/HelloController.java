package com.ysongyang.jardemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/index")
    public String index(){
        return "hello index" + new Date();
    }
}
