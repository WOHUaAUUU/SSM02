package ssy.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssy.com.pojo.Employee;
import ssy.com.service.EmployeeService;
import ssy.com.util.R;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public R showAll(){
        List<Employee> employees = employeeService.showAll();
        return R.ok(employees);
    }
}
