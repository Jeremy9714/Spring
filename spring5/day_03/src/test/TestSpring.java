package test;

import config.MyConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * @author Chenyang
 * @create 2021-04-08-17:44
 */
public class TestSpring {

    @Test
    public void test2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);
    }
}
