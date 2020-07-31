package druid.controller;

import druid.dto.UserDTO;
import druid.entity.User;
import org.springframework.beans.BeanUtils;

import java.util.Arrays;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-07-09 18:19
 **/
public class UserController {
    public static void main(String[] args) {
        User user = new User();
        user.setId("1");
        user.setUsername("jack");
        user.setPassword("123456");
        user.setSex("F");
        user.setRoles(Arrays.asList("role_1","role_2"));
        UserDTO userDto = new UserDTO();
        BeanUtils.copyProperties(user,userDto);
        System.out.println(userDto.toString());
    }
}
