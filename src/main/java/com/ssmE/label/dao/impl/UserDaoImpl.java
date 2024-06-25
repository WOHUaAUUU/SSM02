package com.ssmE.label.dao.impl;


import com.ssmE.label.dao.UserDao;
import com.ssmE.label.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

// 实现接口
@Repository
public class UserDaoImpl implements UserDao, KK {

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
