package com.learn.design.strategy;

import org.springframework.stereotype.Service;

@Service
public class StrategyA implements Strategy {

    @Override
    public void test(String test) {
        System.out.println("---------- StrategyInterfaceA ------------ " + test);
    }
}
