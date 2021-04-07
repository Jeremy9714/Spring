package spring5.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.bean.Book;
import spring5.bean.Book2;
import spring5.bean.User;
import spring5.bean.Order;

/**
 * @author Chenyang
 * @create 2021-04-06-14:48
 */
public class TestSpring5 {
    @Test
    public void testBook2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book2 book2 = context.getBean("book2", Book2.class);
        System.out.println(book2);
        book2.testBook();
    }

    @Test
    public void testOrder() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
        order.testOrder();
    }

    @Test
    public void testBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testBook();
    }

    @Test
    public void testAdd() {
        //加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("bean1.xml");

        //获取配置创建的对象
        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }
}
