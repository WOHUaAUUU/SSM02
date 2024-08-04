import com.ssm.jdbc.templent.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = {"classpath:sping-jdbctemp-01.xml" })
public class jdbcTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
        // 测试代码
        String sql = "INSERT INTO students(id,name,gender,age) VALUES(?,?,?,?)";
        String[] s = {"6", "王海东", "男", "25"};
        int update = jdbcTemplate.update(sql, s);
        System.out.printf("update: " + update);
    }

    //一行一列
    @Test
    public void test2() {
        String sql = "SELECT count(*) FROM students";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.printf("integer: " + integer);
    }

    //一行多列
    @Test
    public void test3() {
        String sql = "SELECT * FROM students where id=?";
        Student student = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Student.class), 1);
        System.out.printf("student: " + student);

    }

    // 多行多列
    @Test
    public void test4() {
        String sql = "SELECT * FROM students";
        List<Student> students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
//        students.forEach(System.out::println);
    }
}
