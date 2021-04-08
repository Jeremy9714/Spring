package test;

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
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        student.print();
    }
}
