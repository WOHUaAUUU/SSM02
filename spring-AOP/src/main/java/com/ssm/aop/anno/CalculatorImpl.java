package com.ssm.aop.anno;

import org.springframework.stereotype.Component;

// 定义一个组件
@Component
public class CalculatorImpl implements Calculator {
    private  Calculator calculator;
    @Override
    public int add(int i, int j) {
        int res = i+j;
//        int a=10/0;
        return res;
    }

    @Override
    public int sub(int i, int j) {
        int res = i-j;
        return res;
    }

    @Override
    public int mul(int i, int j) {
        int res = i*j;
        return res;
    }

    @Override
    public int div(int i, int j) {
        int  res = i/j;
        return res;
    }
}
