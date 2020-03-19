package com.learn.spring.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: java:MyConfig
 * @description:
 * @author: clark
 * @create: 2020-03-19 10:17
 **/
@Configuration
@Slf4j
public class MyConfig implements WebMvcConfigurer {

    /**
     * 进行拦截器的注册处理操作
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.info("**** MyConfig addInterceptors init ****");
        //拦截处理操作的匹配路径
        MyInterceptor myInterceptor = new MyInterceptor();
        InterceptorRegistration register = registry.addInterceptor(myInterceptor);
        register.addPathPatterns("/**/");
    }
}
