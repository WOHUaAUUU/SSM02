package ssy.com.mapper;

import org.apache.ibatis.annotations.Param;
import ssy.com.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
//    多行多列
    List<Employee>selectAll();
    Employee selectById(Integer id);
    Integer insert(Employee employee);
    Integer update(@Param("empID") Integer empID,
                   @Param("empSalary") Double empSalary);
    List<Employee> selectByIdAndName(Map<String, Object> map);
//    单行单列
    Integer selectCount();
//    查询结果有多个，且不能封装成对象，使用map，返回多个聚合函数的结果
    Map<String,Object> selectByMap();
}
