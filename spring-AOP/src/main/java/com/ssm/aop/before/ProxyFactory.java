package com.ssm.aop.before;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyFactory<T> {
    private T target;

    public ProxyFactory(T target) {
        this.target = target;
    }

    public T getProxy() {
        // 使用Proxy.newProxyInstance()方法创建代理对象
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        T o = (T)Proxy.newProxyInstance(classLoader, interfaces, new invoke());
        return  o;
    }

    public class invoke implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            // 在调用目标方法之前执行的逻辑
            System.out.println(method.getName()+"方法执行了,入参是"+ Arrays.toString(args));
            Object invoke = method.invoke(target, args);
            // 在调用目标方法之后执行的逻辑
            System.out.println(method.getName()+"方法执行结束了,出参是"+invoke);
            return invoke;
        }
    }
}
