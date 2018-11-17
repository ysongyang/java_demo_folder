package com.ysongyang.jardemo.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ysongyang.jardemo.entity.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 14:16
 * @Description:
 */
//@Mapper
public interface UsersMapper {

    @Select("select * from users where name = #{name}")
    Users findByName(@Param("name") String name);

    @Insert("insert into users(name,age) values(#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Select("select * from users")
    List<Users> findUsersList();

}
