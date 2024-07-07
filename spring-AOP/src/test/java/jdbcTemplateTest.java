import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = {"classpath:sping-jdbctemp-01.xml" })
public class jdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void test() {
        // 测试代码
        String sql="INSERT INTO students(id,name,gender,age) VALUES(?,?,?,?)";
        String [] s={"6","王海东","男","25"};
        int update = jdbcTemplate.update(sql, s);
        System.out.printf("update: "+update);
    }
}
