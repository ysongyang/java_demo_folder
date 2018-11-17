package com.ysongyang.jardemo.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 11:10
 * @Description:全局捕获异常类 1. 捕获返回JSON 2. 捕获返回页面
 */

@ControllerAdvice(basePackages = "com.ysongyang.jardemo.controller")
public class GlobalExceptionHandler {

    //ResponseBody 表示返回JSON格式
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String, Object> errorResult(HttpServletRequest request, Exception e) {
        Map<String, Object> errorResultMap = new HashMap<>();
        errorResultMap.put("errorCode", "500");
        errorResultMap.put("errorMessage", "全局捕获异常系统错误："+e.getMessage());
        return errorResultMap;
    }
}
