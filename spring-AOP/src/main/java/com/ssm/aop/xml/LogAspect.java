package com.ssm.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

public class LogAspect {
    @Pointcut("execution(public int com.ssm.aop.xml.CalculatorImpl.*(..))")
    public void pointcut(){
    }
    // 在com.ssm.aop.anno.CalculatorImpl类的add方法执行前，执行beforeLog方法
@Before("pointcut()")
    public void beforeLog(JoinPoint joinPoint)  {
    String name = joinPoint.getSignature().getName();
    Object[] args = joinPoint.getArgs();
    System.out.println("日志功能:"+name+"方法执行了,参数是:"+ Arrays.toString(args));
    }

// 在com.ssm.aop.anno.CalculatorImpl类的add方法执行后，执行afterLog方法
    @After("execution(public int com.ssm.aop.xml.CalculatorImpl.add(int,int))")
//    @After("execution(* com..CalculatorImpl.*(..))")
    public void afterLog() {
        System.out.println("方法执行后的记录日志");
    }

// 在com.ssm.aop.anno.CalculatorImpl类的add方法正常执行后，执行afterReturningLog方法
    @AfterReturning(value = "execution(public int com.ssm.aop.xml.CalculatorImpl.add(int,int))",returning = "result")
    public void afterReturningLog(JoinPoint joinpoint,Object result) {
        String name = joinpoint.getSignature().getName();
        System.out.println("日志功能"+name+"方法正常执行了,出参是："+result);
    }

// 在com.ssm.aop.anno.CalculatorImpl类的add方法出现异常后，执行afterThrowingLog方法
    @AfterThrowing(value = "execution(public int com.ssm.aop.xml.CalculatorImpl.add(int,int))"
    ,throwing = "e")
    public void afterThrowingLog(JoinPoint joinPoint,Exception e) {
        String name = joinPoint.getSignature().getName();
        System.out.println("日志功能"+name+"方法执行出现异常了,异常是："+e);
    }
}
