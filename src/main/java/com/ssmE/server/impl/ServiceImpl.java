package com.ssmE.server.impl;

import com.ssmE.pojo.User;
import com.ssmE.server.Service;

import java.util.List;

public class ServiceImpl implements Service {
    @Override
    public List<User> showall() {
        System.out.println("service的impl的showall方法执行了...");
        return null;
    }
}
