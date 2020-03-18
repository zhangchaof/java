package com.learn.design.strategy;

import org.springframework.stereotype.Service;

@Service
public class StrategyB implements Strategy {
    @Override
    public void test() {
        System.out.println("---------- StrategyInterfaceB ------------ ");
    }
}
