package com.ysongyang.jardemo.controller;

import com.ysongyang.jardemo.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 13:35
 * @Description: 演示SpringBoot异步调用
 */
@RestController
@Slf4j
public class MemberController {

    @Autowired
    private MemberService memberService;

    //@value 获取配置文件信息
    @Value("${name}")
    private String name;

    @Value("${http_url}")
    private String httpUrl;

    @RequestMapping("/addMemberAndSendEmail")
    public String addMemberAndSendEmail() {
        log.info("一行");
        String res = memberService.addMemberAndSendEmail();
        log.info("四行——res："+res);
        return res;
    }

    @RequestMapping("/getName")
    public String getName(){
        return name;
    }

    @RequestMapping("/getUrl")
    public String getUrl(){
        return httpUrl;
    }
}
