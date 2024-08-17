package ssy.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssy.com.mapper.EmployeeMapper;
import ssy.com.pojo.Employee;

import java.util.List;

@Service
//开启事务支持,全部方法都开启事务
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
//    局部覆盖全局
    @Transactional(readOnly = true)
    public List<Employee> showAll() {
        return employeeMapper.selectAllEmployee();
    }
}

