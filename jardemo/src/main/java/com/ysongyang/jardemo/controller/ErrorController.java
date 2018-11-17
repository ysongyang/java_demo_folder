package com.ysongyang.jardemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 11:02
 * @Description:
 */

@RestController
@RequestMapping("error")
public class ErrorController {

    @RequestMapping("/getUser")
    public String getUser(int i) {
        int j = 1 / i;
        return "success" + j;
    }

    @RequestMapping("/index")
    public String index(){

        return "error index";
    }
}
