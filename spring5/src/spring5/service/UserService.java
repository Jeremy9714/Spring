package spring5.service;

import spring5.dao.UserDAO;

/**
 * @author Chenyang
 * @create 2021-04-07-19:56
 */
public class UserService {

    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(){
        System.out.println("userService add");
        userDAO.update();
    }
}
