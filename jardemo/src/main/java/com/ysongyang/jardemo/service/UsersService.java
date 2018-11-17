package com.ysongyang.jardemo.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ysongyang.jardemo.entity.Users;
import com.ysongyang.jardemo.mapper.UsersMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 14:20
 * @Description:
 */
@Service
@Slf4j
public class UsersService {

    @Autowired
    private UsersMapper usersMapper;

    /**
     * 增加@Transactional事务后，如果1/age 报错，事务将会回滚，不会存储数据库中
     * @param name
     * @param age
     * @return
     */
    @Transactional
    public int insertUser(String name, Integer age) {
        Integer idResult = usersMapper.insert(name, age);
        int i = 1 / age;
        log.info("#########idResult:{}##################", idResult);

        return idResult;
    }

    public PageInfo<Users> findUsersList(int page, int pageSize){
        PageHelper.startPage(page,pageSize);
        List<Users> listUser = usersMapper.findUsersList();
        PageInfo<Users> pageInfo = new PageInfo<>(listUser);
        return pageInfo;
    }
}
