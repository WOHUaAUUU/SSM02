package com.ssm.aop.before;

public class CalculatorImplProxy implements Calculator {

        private Calculator calculator;

    public CalculatorImplProxy(Calculator calculator) {
            this.calculator = calculator;
        }

    @Override
    public int add(int i, int j) {
        // 执行其他相关操作
        System.out.println("add方法执行了传入的参数是"+i+"和j"+j);
        int result = i + j;
        // 返回代理结果
        System.out.println("Add方法执行了，返回的结果是"+ result );
        return result;

    }

    @Override
    public int sub(int i, int j) {
        return 0;
    }

    @Override
    public int mul(int i, int j) {
        return 0;
    }

    @Override
    public int div(int i, int j) {
        return 0;
    }
}

