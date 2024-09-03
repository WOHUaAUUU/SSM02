package ssy.com.robot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RobotAutoConfiguration.class)
public @interface EnableRobotAutoConfiguration {


}


