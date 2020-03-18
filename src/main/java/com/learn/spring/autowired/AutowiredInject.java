package com.learn.spring.autowired;

import com.learn.design.strategy.Strategy;
import org.springframework.beans.factory.annotation.Autowired;
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
public class AutowiredInject {

    @Autowired
    Map<String, Strategy> strategyInterfaceMap;

    @PostConstruct
    public void init() {
        System.out.println("StrategyInterface = " + strategyInterfaceMap);
    }
}
