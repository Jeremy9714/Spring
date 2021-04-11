package service;

import dao.UserDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author Chenyang
 * @create 2021-04-10-19:43
 */
@Service
//@Transactional //为这类全部的方法添加事务
public class UserService {

    @Resource
    private UserDAO userDAO;

    //为该方法添加事务
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, timeout = 5)
    public void transaction() {
        userDAO.addMoney();

        //模拟异常
        int a = 10 / 0;

        userDAO.reduceMoney();
    }
}
