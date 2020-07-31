package com.example.multisource.mapper2;

import com.example.multisource.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
/*@Mapper
@Repository*/
public interface UserMapper {
    @Select("select * from user")
    List<User> getAllUser();
    List<User> getAllUser1();
}