package druid.entity;

import druid.dto.UserDTO;
import druid.face.Converter;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-07-09 18:17
 **/
@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String sex;
    private List<String> roles;


    public User convertToUser(UserDTO userDTO){
        UserDTOConvert userDTOConvert = new UserDTOConvert();
        User convert = userDTOConvert.doBackward(userDTO);
        return convert;
    }

    public UserDTO convertFor(User user){
        UserDTOConvert userDTOConvert = new UserDTOConvert();
        UserDTO convert = userDTOConvert.doForward(user);
        return convert;
    }

    private static class UserDTOConvert implements Converter<User,UserDTO> {
        @Override
        public User doBackward(UserDTO userDTO) {
            User user = new User();
            BeanUtils.copyProperties(userDTO,user);
            return user;
        }

        @Override
        public UserDTO doForward(User user) {
            UserDTO userDTO = new UserDTO();
            BeanUtils.copyProperties(user,userDTO);
            return userDTO;
        }
    }
}
