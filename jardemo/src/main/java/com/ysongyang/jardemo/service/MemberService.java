package com.ysongyang.jardemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 13:35
 * @Description:
 */
@Service
@Slf4j
public class MemberService {

    /**
     * 添加用户的时候会发送邮件
     * @Async 避开单线程执行
     * @return
     *
     */
    @Async
    public String addMemberAndSendEmail() {
        log.info("二行");
        try {
            //休眠5秒
            Thread.sleep(5000);
        } catch (Exception e) {

        }
        log.info("三行");
        return "service";
    }
}
