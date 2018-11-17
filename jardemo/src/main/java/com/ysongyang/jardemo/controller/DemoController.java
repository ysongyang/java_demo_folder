package com.ysongyang.jardemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2018/11/16 0016 10:50
 * @Description:
 */
@RestController
@RequestMapping("demo")
public class DemoController {

    @RequestMapping("/index")
    public String index(){
        System.out.println("index");
        return "index";
    }

}
