package spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.service.UserService;

/**
 * @author Chenyang
 * @create 2021-04-07-19:58
 */
public class TestBean {

    @Test
    public void testBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
