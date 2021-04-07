package spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.bean.User;

/**
 * @author Chenyang
 * @create 2021-04-06-14:48
 */
public class TestSpring5 {

    @Test
    public void testAdd(){
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }
}
