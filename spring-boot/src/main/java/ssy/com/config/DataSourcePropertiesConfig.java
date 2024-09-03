package ssy.com.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "spring.jdbc.datasource")
public class DataSourcePropertiesConfig {

    private String driverClassName;

    private String url;

    private String username;

    private String password;
}
