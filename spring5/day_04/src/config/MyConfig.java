package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Chenyang
 * @create 2021-04-09-21:12
 */
@Configuration
@ComponentScan(basePackages={"aop"})
@EnableAspectJAutoProxy(proxyTargetClass=true) //开启生成代理对象(aop)
public class MyConfig {
}
