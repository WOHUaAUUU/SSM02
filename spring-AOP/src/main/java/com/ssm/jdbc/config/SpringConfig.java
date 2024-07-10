package com.ssm.jdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

//声明一个配置类
@Configuration
//开启包扫描
@ComponentScan(basePackages = {"com.ssm.jdbc.tx"})
//加载外部配置文件
@PropertySource("classpath:mysql-jdbc-temp.properties")
//开启事务支持
@EnableTransactionManagement
public class SpringConfig {
//    创建Druid连接池
    @Bean
    public DruidDataSource druidDataSource(@Value("${jdbc.url}") String url,
                                           @Value("${jdbc.username}") String username,
                                           @Value("${jdbc.password}") String password,
                                           @Value("${jdbc.driver}") String driverClassName) {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        druidDataSource.setDriverClassName(driverClassName);
        return druidDataSource;
    }

//    创建JdbcTemplate
    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(druidDataSource);
        return jdbcTemplate;
    }

//    创建事务管理器
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource DataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(DataSource);
        return dataSourceTransactionManager;
    }
}