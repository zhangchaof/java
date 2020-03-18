package com.learn.design.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Map;

/**
 * @program: java:Main
 * @description:
 * @author: clark
 * @create: 2020-03-18 11:30
 **/
@Component
public class Main {
    @Autowired
    Map<String, Strategy> strategyInterfaceMap;
    
    @PostConstruct
    public void init() {
        System.out.println("StrategyInterface = " + strategyInterfaceMap);
    }
}
