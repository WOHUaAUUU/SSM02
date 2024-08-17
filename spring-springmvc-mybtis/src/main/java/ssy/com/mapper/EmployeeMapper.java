package ssy.com.mapper;

import ssy.com.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    List<Employee> selectAllEmployee();
}
