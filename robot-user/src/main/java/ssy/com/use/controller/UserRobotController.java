package ssy.com.use.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssy.com.robot.service.RobotService;

@RestController
@RequestMapping("/robot")
public class UserRobotController {
    @Autowired
    private RobotService robotService;
    @GetMapping
    public String getRobot(){

        String s = robotService.Hello();
        System.out.println(s);
        return "ok";
    }
}