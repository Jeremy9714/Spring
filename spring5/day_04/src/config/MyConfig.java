package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Chenyang
 * @create 2021-04-09-21:12
 */
@Configuration
@ComponentScan(basePackages={"aopanno"})
@EnableAspectJAutoProxy(proxyTargetClass=true) //开启Aspect生成代理对象
public class MyConfig {
}
