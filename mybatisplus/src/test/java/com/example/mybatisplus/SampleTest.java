package com.example.mybatisplus;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.User;
import com.example.mybatisplus.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;


import javax.annotation.Resource;
import java.util.List;


@SpringBootTest
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    /*
    * 查询
    * */
    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
        //.select(指定查询字段)
        //.inSql(可以内嵌查询sql语句)
        List<User> userList = userMapper.selectList(new QueryWrapper<User>().select("id","name"));
        userList.forEach(System.out::println);
    }
    /*
    * 插入
    * */
    @Test
    public void testInsert() {
       User user=new User();
       user.setName("jack");
       user.setAge(1);
       user.setEmail("2312312312");
        int i = userMapper.insert(user);
        User user1 = userMapper.selectById(user.getId());
        System.out.println(user1.toString());
        userMapper.deleteById(user1.getId());
        List<User> userList = userMapper.selectList(new QueryWrapper<User>().eq("is_deleted","0"));
        userList.forEach(System.out::println);
    }
    /*
    * 更新
    * */
    @Test
    public void testUpdate() {
        System.out.println(("----- selectAll method test ------"));
        User user = new User();
        user.setAge(100);
        int i = userMapper.update(user, new UpdateWrapper<User>().gt("age", 0));

        //UserMapper 中的 selectList() 方法的参数为 MP 内置的条件封装器 Wrapper
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
    /*
    * 分页
    * */
    @Test
    public void testPage() {
        Page<User> userPage = new Page<>(2,2);

        userMapper.selectPageVo(userPage,0);
        userMapper.selectPage(new Page<User>(3,2),null);
    }



}