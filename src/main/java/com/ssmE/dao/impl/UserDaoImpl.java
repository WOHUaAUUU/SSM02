package com.ssmE.dao.impl;


import com.ssmE.dao.UserDao;
import com.ssmE.pojo.User;

import java.util.List;

// 实现接口
public class UserDaoImpl implements UserDao,KK {

    @Override
    public List<User> selectAll() {
        System.out.println("UserDaoImpl的selectAll方法执行了");
        return null;
    }

    @Override
    public List<String> getAll() {
        System.out.println("UserDaoImpl的getAll方法执行了");
        return null;
    }


}
