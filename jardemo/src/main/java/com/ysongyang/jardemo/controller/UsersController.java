package com.ysongyang.jardemo.controller;

import com.github.pagehelper.PageInfo;
import com.ysongyang.jardemo.entity.Users;
import com.ysongyang.jardemo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 14:24
 * @Description:
 */

@RestController
@RequestMapping("users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @RequestMapping("/insertUser")
    public Integer insertUser(String name, Integer age) {
        return usersService.insertUser(name, age);
    }

    @RequestMapping("/getUsers")
    public PageInfo<Users> getUserList(int page,int pageSize){
        return usersService.findUsersList(page,pageSize);
    }
}
