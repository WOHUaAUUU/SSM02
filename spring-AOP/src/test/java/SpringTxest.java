import com.ssm.jdbc.tx.Service.StudentService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:spring-temp01.xml")
public class SpringTxest {
    @Autowired
    private StudentService studentService;
    @Test
    public void test(){
    studentService.changeInfo();
}
}