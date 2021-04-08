package dao;

import org.springframework.stereotype.Repository;

/**
 * @author Chenyang
 * @create 2021-04-08-19:27
 */

@Repository
public class UserDAOImpl implements UserDAO{
    @Override
    public void add() {
        System.out.println("userDao add");
    }
}
