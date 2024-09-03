package ssy.com.use;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ssy.com.robot.config.EnableRobotAutoConfiguration;

@SpringBootApplication
@EnableRobotAutoConfiguration
public class RobotApplication {
    public static void main(String[] args) {
        SpringApplication.run(RobotApplication.class, args);
    }
}
