package com.ssm.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogAspect {
    // 在com.ssm.aop.anno.CalculatorImpl类的add方法执行前，执行beforeLog方法
@Before("execution(public int com.ssm.aop.anno.CalculatorImpl.add(int,int))")
    public void beforeLog(JoinPoint joinPoint)  {
    String name = joinPoint.getSignature().getName();
    Object[] args = joinPoint.getArgs();
    System.out.println("日志功能:"+name+"方法执行了,参数是:"+ Arrays.toString(args));
    }

// 在com.ssm.aop.anno.CalculatorImpl类的add方法执行后，执行afterLog方法
    @After("execution(public int com.ssm.aop.anno.CalculatorImpl.add(int,int))")
    public void afterLog() {
        System.out.println("方法执行后的记录日志");
    }

// 在com.ssm.aop.anno.CalculatorImpl类的add方法正常执行后，执行afterReturningLog方法
    @AfterReturning("execution(public int com.ssm.aop.anno.CalculatorImpl.add(int,int))")
    public void afterReturningLog() {
        System.out.println("方法正常执行后的记录日志");
    }

// 在com.ssm.aop.anno.CalculatorImpl类的add方法出现异常后，执行afterThrowingLog方法
    @AfterThrowing("execution(public int com.ssm.aop.anno.CalculatorImpl.add(int,int))")
    public void afterThrowingLog() {
        System.out.println("方法出现异常后的记录日志");
    }
}
