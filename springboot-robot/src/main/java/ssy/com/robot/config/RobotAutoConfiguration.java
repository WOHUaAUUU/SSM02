package ssy.com.robot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import ssy.com.robot.properties.RobotProperties;
import ssy.com.robot.service.RobotService;

@Configuration
@Import({RobotProperties.class, RobotService.class})
public class RobotAutoConfiguration {
}
