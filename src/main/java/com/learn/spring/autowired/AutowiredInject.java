package com.learn.spring.autowired;

import com.learn.design.strategy.Strategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @program: java:AutowiredInject
 * @description:
 * @author: clark
 * @create: 2020-03-18 14:12
 **/
@Component
@Slf4j
public class AutowiredInject {
    /**
     * 静态属性 用set方法注入
     */
    private static String demo;

    /**
     * 自动注入实现接口类
     */
    @Autowired
    Map<String, Strategy> strategyInterfaceMap;

    @PostConstruct
    public void init() {
        log.info("StrategyInterface = " + strategyInterfaceMap);
        log.info("init demo = " + demo);
    }

    @Value("${demo}")
    public void setDemo(String demo) {
        AutowiredInject.demo = demo;
    }
}
