package com.ysongyang.jardemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 注解@SpringBootApplication 会扫描com.ysongyang.jardemo下的所有包以及子包
 *
 * 第一种Mybatis启动方式可以在mapper层不需要加mapper注解，但是一定要在启动类上增加@MapperScan扫包
 * 第二种Mybatis启动方式在mybatis接口上加注解@Mapper，就不需要在启动类上增加@MapperScan扫包
 */
@SpringBootApplication
//@EnableAsync
@MapperScan(basePackages = {"com.ysongyang.jardemo.mapper"})
public class JardemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JardemoApplication.class, args);
    }
}
