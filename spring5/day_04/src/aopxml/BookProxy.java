package aopxml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Chenyang
 * @create 2021-04-09-21:19
 */
public class BookProxy {

    public void before() {
        System.out.println("before");
    }

    public void after() {
        System.out.println("after");
    }

    public void afterThrowing() {
        System.out.println("afterThrowing");
    }

    public void afterReturning() {
        System.out.println("afterReturning");
    }

    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around before");
        point.proceed();
        System.out.println("around after");
    }
}
