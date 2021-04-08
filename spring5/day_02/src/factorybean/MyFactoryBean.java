package factorybean;

import collection.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * 工厂bean: 在配置文件中定义的bean类型可以与返回类型不同
 * @author Chenyang
 * @create 2021-04-08-15:24
 */
public class MyFactoryBean implements FactoryBean<Course> {

    //返回的bean对象
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("course_1");
        return course;
    }

    //返回的Class类型
    @Override
    public Class<?> getObjectType() {
        return null;
    }

    //是否为单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
