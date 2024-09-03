package ssy.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssy.com.mapper.EmployeeMapper;
import ssy.com.pojo.Employee;
import ssy.com.service.EmployeeService;
import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employee;
    @Override
    @Transactional(readOnly = true)
    public List<Employee> shouAll() {
        return employee.selectAll();
    }
}
