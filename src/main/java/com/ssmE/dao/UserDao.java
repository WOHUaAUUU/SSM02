package com.ssmE.dao;

import com.ssmE.pojo.User;

import java.util.List;

public interface UserDao {
    List<User> selectAll();
}
