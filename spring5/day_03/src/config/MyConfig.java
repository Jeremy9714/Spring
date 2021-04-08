package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @author Chenyang
 * @create 2021-04-08-19:46
 */

//作为配置类，替代xml配置文件
@Configuration
//开启组件扫描
@ComponentScan(basePackages = {"dao","service"})
public class MyConfig {
}
