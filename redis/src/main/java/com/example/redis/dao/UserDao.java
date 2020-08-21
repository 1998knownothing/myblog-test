package com.example.redis.dao;

import com.example.redis.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-21 16:29
 **/
@Slf4j
@Service
@CacheConfig(cacheNames = "TEST.USER")
public class UserDao {
/*
* 注解缓存的使用

@Cacheable：在方法执行前Spring先查看缓存中是否有数据，如果有数据，则直接返回缓存数据；没有则调用方法并将方法返回值放进缓存。

@CachePut：将方法的返回值放到缓存中。

@CacheEvict：删除缓存中的数据。
*
* */
    @CachePut(key="#user.id")
    public User set(User user){
        log.info("执行set:"+user.getId());
        return user;
    }
    @Cacheable(key="#user.id")
    public User get(User user){
        log.info("执行get:"+user.getId());
        return user;
    }
    @CacheEvict(key="#user.id")
    //@CacheEvict(allEntries = true)清理全部
    public void del(User user){
        log.info("执行del:"+user.getId());
    }
}
