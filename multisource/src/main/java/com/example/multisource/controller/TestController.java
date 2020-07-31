package com.example.multisource.controller;

import com.example.multisource.mapper1.UserMapperOne;
import com.example.multisource.mapper2.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-06-02 23:04
 **/
@RestController
public class TestController {
    @Resource
    UserMapperOne userMapperOne;
    @Resource
    UserMapper userMapper;
    @GetMapping("/get1")
    public Object getUserByDatasource1(){
        return userMapperOne.getAllUser();
    }
    @GetMapping("/get2")
    public Object getUserByDatasource2(){
        return userMapper.getAllUser();
    }
    @GetMapping("/get3")
    public Object getUserByDatasource3(){
        return userMapper.getAllUser1();
    }
}
