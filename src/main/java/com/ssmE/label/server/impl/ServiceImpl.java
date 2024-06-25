package com.ssmE.label.server.impl;

import com.ssmE.label.pojo.User;
import com.ssmE.label.server.Service;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Override
    public List<User> showall() {
        System.out.println("service的impl的showall方法执行了...");
        return null;
    }
}
