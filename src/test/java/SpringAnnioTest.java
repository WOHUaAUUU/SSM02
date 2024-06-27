import com.ssmE.label.config.ConfigProperties;
import com.ssmE.label.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnioTest {
    @Test
    public void test() {
        // 测试代码
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sprinng-anno.xml");
        System.out.println(context.getBean("userController", UserController.class));

        System.out.println(context.getBean("userController1", UserController.class));
    }

    @Test
    public void test2() {
        // 测试代码
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sprinng-anno.xml");
        UserController controller2 = context.getBean("userController", UserController.class);
        controller2.listall();
        ConfigProperties properties = context.getBean("configProperties", ConfigProperties.class);
        System.out.println(properties.getName()+' '+properties.getAge());
    }
}