package aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 增强类1
 * @author Chenyang
 * @create 2021-04-09-20:29
 */
@Component
@Aspect //生成代理对象
@Order(6) //设置优先级
public class UserProxy {

    //抽取相同切入点
    @Pointcut(value="execution(* aopanno.User.add(..))")
    public void pointCut(){}

    //前置通知
    @Before(value="pointCut()")
    public void before(){
        System.out.println("user before");
    }

    //环绕通知
    @Around(value="pointCut()")
    //参数ProceedingJoinPoint是切入点
    public void around(ProceedingJoinPoint point) throws Throwable {
        //被增强方法执行前的通知
        System.out.println("around before");
        //执行被增强方法
        point.proceed();
        //被增强方法执行后的通知
        System.out.println("around after");
    }

    //返回通知(若被增强方法抛出异常，则不会执行)
    @AfterReturning(value="pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning");
    }

    //异常通知
    @AfterThrowing(value="pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

    //最终通知(无论被增强方法是否抛出异常，都会执行)
    @After(value="pointCut()")
    public void after(){
        System.out.println("after");
    }
}
