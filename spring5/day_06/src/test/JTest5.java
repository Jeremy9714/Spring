package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import service.UserService;

/**
 * @author Chenyang
 * @create 2021-04-11-16:47
 */

//@ExtendWith(SpringExtension.class) //指定单元测试框架的版本
//@ContextConfiguration("classpath:bean1.xml")
@SpringJUnitConfig(locations = "classpath:bean1.xml")
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.transaction();
    }
}
