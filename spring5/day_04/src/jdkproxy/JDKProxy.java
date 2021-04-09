package jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Chenyang
 * @create 2021-04-09-18:31
 */
public class JDKProxy {

    public static void main(String[] args) {
        UserDAO userProxy = (UserDAO) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),
                UserDAOImpl.class.getInterfaces(), new UserProxy(new UserDAOImpl()));
        userProxy.add(1, 2);
        userProxy.update("abc");
    }

}

class UserProxy implements InvocationHandler {
    private Object obj;

    public UserProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法执行前
        System.out.print("运行的方法为: " + method.getName() + " 方法的参数为: " + Arrays.toString(args));

        //增强的方法
        Object returnValue = method.invoke(obj, args);

        //方法执行后
        System.out.println(" 方法运行结果为: " + returnValue);
        return returnValue;
    }
}