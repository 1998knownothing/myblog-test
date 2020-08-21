package com.example.redis.entity;

import lombok.Data;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-21 16:30
 **/
@Data
public class User {
    private String id;

    private String username;

    private String password;
}
