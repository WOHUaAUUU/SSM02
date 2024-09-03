package ssy.com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import ssy.com.interceptor.MyInterceptor;

@Configuration
public class MvCConfig implements WebMvcConfigurer {
//    springmvc 添加自定义拦截器
    @Autowired
    private MyInterceptor myInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/hello");
    }
}
