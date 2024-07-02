package com.ssm.aop.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// 表示这是一个配置类
@Configuration
// 指定扫描的组件扫描包路径
@ComponentScan("com.ssm.aop.anno")
// 启用AspectJ自动代理
@EnableAspectJAutoProxy
public class SpringConfig {
}
