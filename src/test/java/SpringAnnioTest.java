import com.ssmE.label.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnioTest {
    @Test
    public void test() {
        // 测试代码
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sprinng-anno.xml");
<<<<<<<<< Temporary merge branch 1
        System.out.println(context.getBean("userController", UserController.class));
=========
        System.out.println(context.getBean("userController1", UserController.class));
    }

    @Test
    public void test2() {
        // 测试代码
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sprinng-anno.xml");
        UserController controller2 = context.getBean("userController1", UserController.class);
        controller2.listall();
>>>>>>>>> Temporary merge branch 2
    }
}