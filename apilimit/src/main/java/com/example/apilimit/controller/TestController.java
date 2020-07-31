package com.example.apilimit.controller;

import com.example.apilimit.annotation.AccessLimit;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-07-23 21:57
 **/
@RestController
public class TestController {
    @Resource
    private RedisTemplate<String, Integer> redisTemplate;  //使用RedisTemplate操作redis
    @AccessLimit()
    @GetMapping("/get")
    public Object get(){
        System.out.println("hello");
        Boolean k = redisTemplate.opsForValue().setIfPresent("k", 1);
        Map<String,Object> map=new HashMap<>();
        map.put("code",2020);
        map.put("msg",k);
        return map;
    }
}
