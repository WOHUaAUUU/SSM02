package ssy.com.ssm;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import ssy.com.mapper.EmployeeMapper;
import ssy.com.pojo.Employee;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Slf4j
public class Employee01Test {
    @Test
    public void test01() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("ssy/com/mapper/mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = build.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectAllEmployee();
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
    }
}
