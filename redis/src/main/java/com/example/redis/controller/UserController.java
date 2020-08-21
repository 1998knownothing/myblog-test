package com.example.redis.controller;

import com.example.redis.dao.NoneDao;
import com.example.redis.dao.UserDao;
import com.example.redis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-21 16:29
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private NoneDao noneDao;

    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("/set/{id}")
    public String set(@PathVariable String id){
        User user = new User();
        user.setId(id);
        user.setUsername("jack");
        user.setPassword(id);
        userDao.set(user);
        return "success";
    }

    @GetMapping("/get/{id}")
    public Object get(@PathVariable String id){

        User user = new User();
        user.setId(id);
        User user1 = userDao.get(user);
        return user1;
    }

    @GetMapping("/del/{id}")
    public Object del(@PathVariable String id){

        User user = new User();
        user.setId(id);
        userDao.del(user);
        return "success";
    }

    @GetMapping("/redis/set/{id}")
    public String set1(@PathVariable String id){
        User user = new User();
        user.setId(id);
        user.setUsername("xxxx");
        user.setPassword(id);
        redisTemplate.opsForValue().set(user,user);
        return "success";
    }

/*
* 不指定缓存域名
* */
    @GetMapping("/setn/{id}")
    public String setn(@PathVariable String id){
        User user = new User();
        user.setId(id);
        user.setUsername("jack");
        user.setPassword(id);
        noneDao.set(user);
        return "success";
    }

    @GetMapping("/getn/{id}")
    public Object getn(@PathVariable String id){

        User user = new User();
        user.setId(id);
        User user1 = noneDao.get(user);
        return user1;
    }

    @GetMapping("/deln/{id}")
    public Object deln(@PathVariable String id){

        User user = new User();
        user.setId(id);
        noneDao.del(user);
        return "success";
    }


}
