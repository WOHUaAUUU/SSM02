package ssy.com.robot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssy.com.robot.properties.RobotProperties;

@Service
public class RobotService {

    @Autowired
    RobotProperties robotProperties;

    public String Hello() {
        return "你好，名字："+robotProperties.getName();
    }
}
