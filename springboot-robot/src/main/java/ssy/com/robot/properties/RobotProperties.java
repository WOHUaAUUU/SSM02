package ssy.com.robot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "robot")
public class RobotProperties {
    private String name;
    private String age;
    private String email;
}
