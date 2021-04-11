package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import service.UserService;

/**
 * @author Chenyang
 * @create 2021-04-11-16:36
 */
@RunWith(SpringJUnit4ClassRunner.class) //制订单元测试框架的版本
@ContextConfiguration("classpath:bean1.xml") //加载配置文件路径
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.transaction();
    }
}
