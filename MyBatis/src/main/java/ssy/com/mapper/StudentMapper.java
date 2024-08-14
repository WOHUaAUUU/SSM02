package ssy.com.mapper;

import ssy.com.pojo.Student;

import java.util.List;

public interface StudentMapper {
    List<Student> selectAllStudentsAndTeacher();
}
