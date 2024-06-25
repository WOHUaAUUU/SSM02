package com.ssmE.label.controller;

import com.ssmE.label.pojo.User;
import com.ssmE.label.server.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;
/**
 @Compontent 用于标记在Spring容器中的一个Bean，将其注册为Spring管理的Bean，一般作用于三层之外的内容使用此注解
 **/
@Controller("userController")
public class UserController {

    private Service userService;
    @Autowired
    public void setService(Service userService) {
        this.userService = userService;
    }

    public List<User> listall(){
      // 查询所有用户
      System.out.println("查询所有用户");
      return userService.showall();
  }
}
