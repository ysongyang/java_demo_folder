package com.ysongyang.jardemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 整合Framework
 */
@Controller
public class FTLIndexController {

    @RequestMapping("ftlIndex")
    public String FTLIndex(Map<String, Object> map) {
        map.put("name", "ysongyang");
        map.put("age", "30");
        map.put("sex", "1");
        return "ftlIndex";
    }
}
