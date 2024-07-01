package com.ssm.aop.before;

public class CalculatorImpl implements Calculator{
    @Override
    public int add(int i, int j) {
        int res = i+j;
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
