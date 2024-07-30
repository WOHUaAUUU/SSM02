package com.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

// 使用Lombok库中的@Data注解，自动生成getter和setter方法
@Data
// 使用Lombok库中的@AllArgsConstructor注解，自动生成包含所有字段的构造方法
@AllArgsConstructor
// 使用Lombok库中的@NoArgsConstructor注解，自动生成无参构造方法
@NoArgsConstructor
public class Schedule {
    private Integer id;
    private String title;
    private Boolean completed;

}
