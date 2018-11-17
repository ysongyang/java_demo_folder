package com.ysongyang.jardemo.entity;


import lombok.Data;

/**
 * @Auther: ysongyang (zz1.com.cn)
 * @Date: 2018/11/16 0016 14:12
 * @Description: 数据实体类层
 */

// @Data = @Getter + @Setter
@Data
public class Users {

    private Integer id;

    private String name;

    private Integer age;

    public static void main(String[] args) {

    }
}
