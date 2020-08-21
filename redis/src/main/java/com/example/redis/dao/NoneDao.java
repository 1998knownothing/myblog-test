package com.example.redis.dao;

import com.example.redis.config.RedisConfig;
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
 * @create: 2020-08-21 16:57
 **/
@Slf4j
@Service
@CacheConfig(cacheNames = {"x","x1"})
public class NoneDao {

    @CachePut
    public User set(User user){
        log.info("执行set:"+user.getId());
        return user;
    }
    @Cacheable
    public User get(User user){
        log.info("执行get:"+user.getId());
        return user;
    }
    @CacheEvict
    //@CacheEvict(allEntries = true)清理全部
    public void del(User user){
        log.info("执行del:"+user.getId());
    }
}
