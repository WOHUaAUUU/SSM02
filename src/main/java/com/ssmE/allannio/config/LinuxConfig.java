package com.ssmE.allannio.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class LinuxConfig implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 获取操作系统名称
        String osName = System.getProperty("os.name");
        // 判断操作系统名称是否包含Windows
        if (osName.contains("Linux")) {
            return true;
        }
        return false;
    }
}
