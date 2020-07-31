package com.example.mybatisplus.customMetaHandler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @program: springboot-example
 * @description:
 * @author: Mr.liu
 * @create: 2020-04-03 01:00
 **/
@Component
@Slf4j
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
     log.info("start fill");
     this.setFieldValByName("createTime",new Date(),metaObject);
     this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("update fill");
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
