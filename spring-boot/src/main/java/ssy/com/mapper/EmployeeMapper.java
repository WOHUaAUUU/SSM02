package ssy.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import ssy.com.pojo.Employee;

import java.util.List;

@Mapper
//将接口的动态代理对象放入IOC容器中
public interface EmployeeMapper {
    List<Employee> selectAll();
}
