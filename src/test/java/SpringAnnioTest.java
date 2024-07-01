import com.alibaba.druid.pool.DruidDataSource;
import com.ssmE.allannio.config.StudentConfig;
import com.ssmE.label.config.ConfigProperties;
import com.ssmE.allannio.config.SpringConfig;
import com.ssmE.label.controller.UserController;
import com.ssmE.label.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class SpringAnnioTest {
    @Test
    public void test() {
        // 测试代码
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sprinng-anno.xml");
        System.out.println(context.getBean("userController", UserController.class));

    }

    @Test
    public void test2() {
        // 测试代码
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sprinng-anno.xml");
        UserController controller2 = context.getBean("userController", UserController.class);
        controller2.listall();
        ConfigProperties properties = context.getBean("configProperties", ConfigProperties.class);
        System.out.println(properties.getName() + ' ' + properties.getAge());
    }

    @Test
    public void test3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        com.ssmE.allannio.config.ConfigProperties properties = context.getBean("configProperties", com.ssmE.allannio.config.ConfigProperties.class);
        System.out.println(properties.getName() + ' ' + properties.getAge());
        //一个bean可以有多个别名
        DruidDataSource dataSource = context.getBean("ds", DruidDataSource.class);
        System.out.println(dataSource);

        // 测试@Import注解，该注解可以导入其他配置类
        StudentConfig config = context.getBean("studentConfig", StudentConfig.class);
        System.out.println(config);
    }

    @Test
    public void test4() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Map<String, User> type = context.getBeansOfType(User.class);
        System.out.println(type);
    }
}