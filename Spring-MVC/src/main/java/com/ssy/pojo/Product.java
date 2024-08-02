package com.ssy.pojo;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Null(message = "必须为空")
    private String name;

    @NotNull(message = "不能为空")
    private String sex ;

    // 断言isTrue为真
@AssertTrue
    // 断言isTrue不为空
    @NotNull
    private Boolean isTrue;

    @AssertFalse
    @NotNull
    private Boolean isFalse;

    @Size(min = 2,max = 5,message = "长度必须在2到5之间")
    private List<String> hobbies;

    @Past
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

}
