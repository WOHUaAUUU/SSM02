import com.ssm.aop.anno.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes= SpringConfig.class) // 注解SpringJUnitConfig，用于配置JUnit测试类，并指定Spring配置类
public class AOPTest02 {
    @Autowired
    private com.ssm.aop.anno.Calculator calculator;
    @Test
    public void test3() {
        System.out.println(calculator.add(1, 2));
    }
}
