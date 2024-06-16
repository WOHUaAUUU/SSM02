package com.ssmE.controller;

import com.ssmE.pojo.User;
import com.ssmE.server.Service;

import java.util.List;

public class UserController {
    private Service userService;

    public void setService(Service userService) {
        this.userService = userService;
    }

    public List<User> listall(){
      // 查询所有用户
      System.out.println("查询所有用户");
      return userService.showall();
  }
}
