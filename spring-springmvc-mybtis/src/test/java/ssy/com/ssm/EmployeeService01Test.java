package ssy.com.ssm;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import ssy.com.pojo.Employee;
import ssy.com.service.EmployeeService;

import java.util.List;

@Slf4j
@SpringJUnitConfig(locations = {"classpath:ssy/com/mapper/spring-mapper.xml", "classpath:spring-service.xml"})
public class EmployeeService01Test {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void test01() {
        List<Employee> employees = employeeService.showAll();
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
    }
}
