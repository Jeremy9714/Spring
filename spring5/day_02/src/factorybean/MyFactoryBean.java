package factorybean;

import collection.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂bean: 在配置文件中定义的bean类型可以与返回类型不同
 * @author Chenyang
 * @create 2021-04-08-15:24
 */
public class MyFactoryBean implements FactoryBean<Course> {

    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("course_1");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
