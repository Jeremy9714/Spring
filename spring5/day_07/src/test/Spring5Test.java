package test;

import bean.User;
import org.junit.Test;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author Chenyang
 * @create 2021-04-11-15:34
 */
public class Spring5Test {

    //函数式风格注册对象到spring
    @Test
    public void test1() {
        GenericApplicationContext context = new GenericApplicationContext();
        //清空内容
        context.refresh();

        //注册对象(第一个参数为注册对象的名称，被@Nullable修饰)
//        context.registerBean("user1", User.class, User::new);
        context.registerBean(User.class, User::new);

        //获取对象
//        User user = context.getBean("user1", User.class);
        User user = context.getBean("bean.User", User.class);
        System.out.println(user);
    }
}
