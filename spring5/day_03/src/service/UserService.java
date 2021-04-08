package service;

import dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Chenyang
 * @create 2021-04-08-18:01
 */

//value可以省略，省略的话则默认为首字母小写的类名称
@Service(value="userService")
public class UserService {

    //不需要set方法
    //添加注入属性注解
//    @Autowired
//    @Qualifier(value="userDAOImpl") //根据属性的名称进行注入
    @Resource(name="userDAOImpl") //
    private UserDAO userDAO;

    //注入基本类型属性
    @Value(value="name")
    private String name;

    public void add(){
        System.out.println("service add");
        userDAO.add();
    }

    @Override
    public String toString() {
        return "UserService{" +
                "name='" + name + '\'' +
                '}';
    }
}
