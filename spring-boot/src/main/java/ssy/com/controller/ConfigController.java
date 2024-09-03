package ssy.com.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ssy.com.config.DataSourcePropertiesConfig;


@RestController

public class ConfigController {
    @Autowired
    private DataSourcePropertiesConfig dataSourceProperties;

    @RequestMapping("/config")
    public String config() {
        System.out.println(dataSourceProperties);
        return "ok";
    }
}