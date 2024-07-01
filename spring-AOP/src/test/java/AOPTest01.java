import com.ssm.aop.before.Calculator;
import com.ssm.aop.before.CalculatorImpl;
import com.ssm.aop.before.CalculatorImplProxy;
import com.ssm.aop.before.ProxyFactory;
import org.junit.Test;

public class AOPTest01 {
    @Test
    public void test() {
        CalculatorImpl calculator = new CalculatorImpl();
        CalculatorImplProxy implProxy = new CalculatorImplProxy(calculator);
        System.out.println(implProxy.add(1, 2));
    }

    @Test
    public void test2() {
        CalculatorImpl calculator = new CalculatorImpl();
        // 代理对象
        ProxyFactory<Calculator> proxyFactory = new ProxyFactory<com.ssm.aop.before.Calculator>(calculator);
        // 设置代理对象的方法
        Calculator proxy = proxyFactory.getProxy();
        // 代理对象执行add方法
        System.out.println(proxy.add(1, 2));

    }
}