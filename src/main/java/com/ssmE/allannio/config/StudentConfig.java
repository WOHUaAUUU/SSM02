package com.ssmE.allannio.config;

import com.ssmE.label.pojo.Student;
import com.ssmE.label.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
@Configuration
public class StudentConfig {
   // 创建一个Student类型的Bean
    @Bean
    public Student student() {
        // 返回一个Student类型的实例，参数分别为name和id
        return new Student("allan", "123456");
    }

// 创建一个User类型的Bean，name属性为allan
    @Bean(name = "allan")
    // 当WindowsConfig类的条件满足时，创建User类型的实例
    @Conditional(WindowsConfig.class)
    public User user1() {
        // 返回一个User类型的实例，参数分别为name和id
        return new User("allan", "123456");
    }
// 创建一个User类型的Bean，name属性为hel
    @Bean(name = "hel")
    // 当LinuxConfig类的条件满足时，创建User类型的实例
    @Conditional(LinuxConfig.class)
    public User user2() {
        // 返回一个User类型的实例，参数分别为name和id
        return new User("hel", "1234587");
    }
}
