package com.ssm.aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Before("execution(public int com.ssm.aop.anno.CalculatorImpl.add(int,int))")
    public void beforeLog() {
        System.out.println("方法执行前记录日志");
    }
}
