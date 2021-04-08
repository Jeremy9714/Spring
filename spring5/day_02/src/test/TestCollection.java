package test;

import bean.Orders;
import collection.Book;
import collection.Course;
import collection.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Chenyang
 * @create 2021-04-08-11:09
 */
public class TestCollection {

    @Test
    public void test4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.print("第四步，获取bean对象: ");
        System.out.println(orders);
        //手动调用bean的销毁方法
        context.close();
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course myFactoryBean = context.getBean("myFactoryBean", Course.class);
        System.out.println(myFactoryBean);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        Book book1 = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book1);
        book.print();
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        student.print();
    }
}
