package config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * 配置类
 *
 * @author Chenyang
 * @create 2021-04-11-12:25
 */
@Configuration //配置类
@ComponentScan(basePackages = {"dao", "service"}) //开启组件扫描
@EnableTransactionManagement //开启事务注解
public class TxConfig {

    //创建数据库连接池对象
    @Bean
    public DruidDataSource getDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql:///user_db");
        dataSource.setUsername("root");
        dataSource.setPassword("9714");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

    //创建jdbcTemplate对象
    @Bean
    public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //从ios容器中根据类型找到dataSource并注入
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    //创建事务管理器对象
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        //从ios容器中根据类型找到dataSource并注入
        transactionManager.setDataSource(dataSource);
        return transactionManager;
    }
}
