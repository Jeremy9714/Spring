package service;

import org.springframework.stereotype.Service;

/**
 * @author Chenyang
 * @create 2021-04-08-18:01
 */

//value可以省略，省略的话则默认为首字母小写的类名称
@Service(value="userService")
public class UserService {

    public void add(){
        System.out.println("service add");
    }
}
