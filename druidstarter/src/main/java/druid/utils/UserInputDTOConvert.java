package druid.utils;


import druid.dto.UserDTO;
import druid.entity.User;
import org.springframework.beans.BeanUtils;

public class UserInputDTOConvert{

    public User convert(UserDTO userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return user;
    }
}