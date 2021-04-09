package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类2
 * @author Chenyang
 * @create 2021-04-09-20:29
 */
@Component
@Aspect
@Order(4)
public class PersonProxy {

    @Before(value="execution(* aop.User.add(..))")
    public void before(){
        System.out.println("Person before");
    }
}
