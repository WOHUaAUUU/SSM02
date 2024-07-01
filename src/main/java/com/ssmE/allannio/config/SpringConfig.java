package com.ssmE.allannio.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration // 声明这是一个配置类
@ComponentScan("com.ssmE.allannio") // 指定扫描的包路径
@PropertySource({"classpath:confin.properties","classpath:mysql-jdbc.properties"}) // 指定配置文件路径
@Import({StudentConfig.class}) // 导入其他配置类
public class SpringConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private  String url;
    @Value("${jdbc.username}")
    private  String username;
    @Value("${jdbc.password}")
    private  String password;
    @Bean(name = {"dataSource","ds"})
    @Scope("singleton")//bean的作用域
    public DruidDataSource dataSource() {
        // 返回DruidDataSource实例

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;

    }
}
