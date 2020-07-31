package druid.dto;

import lombok.Data;

import java.util.List;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-07-09 18:18
 **/
@Data
public class UserDTO {
    private String id;
    private String username;
    private List<String> roles;
}
